package com.unibta.PMIII.controllers;

import com.unibta.PMIII.models.GiftCard;
import com.unibta.PMIII.services.GiftCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1")
@CrossOrigin("*")
public class GiftCardController {

    @Autowired
    GiftCardService giftCardService;

    @PostMapping("/gift-card")
    public ResponseEntity<GiftCard> create(@RequestBody GiftCard card) {
        card.setCardNumber(UUID.randomUUID());
        giftCardService.createCard(card);
        return ResponseEntity.status(HttpStatus.CREATED).body(card);
    }

    @GetMapping("/gift-card")
    public ResponseEntity<List<GiftCard>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(giftCardService.getAll());
    }

    @GetMapping("/gift-card/{id}")
    public ResponseEntity<GiftCard> getOne(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(giftCardService.getById(id));
    }

    @PutMapping("/gift-card")
    public ResponseEntity<GiftCard> update(@RequestBody GiftCard card) {
        giftCardService.createCard(card);
        return ResponseEntity.status(HttpStatus.CREATED).body(card);
    }

    @DeleteMapping("/gift-card/{id}")
    public ResponseEntity<GiftCard> deleteOne(@PathVariable Long id) {
        giftCardService.deleteCardById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
