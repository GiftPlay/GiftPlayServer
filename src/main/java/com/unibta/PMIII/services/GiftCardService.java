package com.unibta.PMIII.services;

import com.unibta.PMIII.models.GiftCard;
import com.unibta.PMIII.repositories.GiftCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GiftCardService {
    @Autowired
    GiftCardRepository giftCardRepository;

    public void createCard(GiftCard card) {
        giftCardRepository.save(card);
    }

    public List<GiftCard> getAll() {
        if (giftCardRepository.findAll().isEmpty()) {
            createCard(new GiftCard(1L, "Netflix", UUID.randomUUID(), 25.00, "NOT YET DONE", "Basic R$ 25.00 Netflix"));
            createCard(new GiftCard(2L, "Google Play", UUID.randomUUID(), 25.00, "NOT YET DONE", "Basic R$ 25.00 Google Play"));
            createCard(new GiftCard(3L, "Steam", UUID.randomUUID(), 25.00, "NOT YET DONE", "Basic R$ 25.00 Steam"));
        }
        return giftCardRepository.findAll();
    }

    public GiftCard getById(Long id) {
        return giftCardRepository.findById(id).orElse(null);
    }

    public void deleteCardById(Long id) {
        giftCardRepository.deleteById(id);
    }
}
