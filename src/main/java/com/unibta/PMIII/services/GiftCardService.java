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
            createApple();
            createGooglePlay();
            createLol();
            createPsn();
            createSteam();
            createXbox();
        }
        return giftCardRepository.findAll();
    }

    private void createApple() {
        createCard(new GiftCard(1L, "Apple", UUID.randomUUID(), 25.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/apple.jpg", "R$ 25.00 Apple"));
        createCard(new GiftCard(2L, "Apple", UUID.randomUUID(), 50.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/apple.jpg", "R$ 50.00 Apple"));
        createCard(new GiftCard(3L, "Apple", UUID.randomUUID(), 75.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/apple.jpg", "R$ 75.00 Apple"));
        createCard(new GiftCard(4L, "Apple", UUID.randomUUID(), 100.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/apple.jpg", "R$ 100.00 Apple"));
    }
    private void createGooglePlay() {
        createCard(new GiftCard(1L, "Google Play Store", UUID.randomUUID(), 25.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/googleplay.jpg", "R$ 25.00 Google Play Store"));
        createCard(new GiftCard(2L, "Google Play Store", UUID.randomUUID(), 50.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/googleplay.jpg", "R$ 50.00 Google Play Store"));
        createCard(new GiftCard(3L, "Google Play Store", UUID.randomUUID(), 75.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/googleplay.jpg", "R$ 75.00 Google Play Store"));
        createCard(new GiftCard(4L, "Google Play Store", UUID.randomUUID(), 100.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/googleplay.jpg", "R$ 100.00 Google Play Store"));
    }

    private void createLol() {
        createCard(new GiftCard(1L, "League of Legends", UUID.randomUUID(), 25.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/lol.jpg", "R$ 25.00 League of Legends"));
        createCard(new GiftCard(2L, "League of Legends", UUID.randomUUID(), 50.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/lol.jpg", "R$ 50.00 League of Legends"));
        createCard(new GiftCard(3L, "League of Legends", UUID.randomUUID(), 75.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/lol.jpg", "R$ 75.00 League of Legends"));
        createCard(new GiftCard(4L, "League of Legends", UUID.randomUUID(), 100.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/lol.jpg", "R$ 100.00 League of Legends"));
    }

    private void createPsn() {
        createCard(new GiftCard(1L, "PlayStation Network", UUID.randomUUID(), 25.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/psn.jpg", "R$ 25.00 PlayStation Network"));
        createCard(new GiftCard(2L, "PlayStation Network", UUID.randomUUID(), 50.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/psn.jpg", "R$ 50.00 PlayStation Network"));
        createCard(new GiftCard(3L, "PlayStation Network", UUID.randomUUID(), 75.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/psn.jpg", "R$ 75.00 PlayStation Network"));
        createCard(new GiftCard(4L, "PlayStation Network", UUID.randomUUID(), 100.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/psn.jpg", "R$ 100.00 PlayStation Network"));
    }

    private void createSteam() {
        createCard(new GiftCard(1L, "Steam", UUID.randomUUID(), 25.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/steam.jpg", "R$ 25.00 Steam"));
        createCard(new GiftCard(2L, "Steam", UUID.randomUUID(), 50.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/steam.jpg", "R$ 50.00 Steam"));
        createCard(new GiftCard(3L, "Steam", UUID.randomUUID(), 75.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/steam.jpg", "R$ 75.00 Steam"));
        createCard(new GiftCard(4L, "Steam", UUID.randomUUID(), 100.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/steam.jpg", "R$ 100.00 Steam"));
    }

    private void createXbox() {
        createCard(new GiftCard(1L, "Xbox Store", UUID.randomUUID(), 25.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/xbox.jpg", "R$ 25.00 Xbox Store"));
        createCard(new GiftCard(2L, "Xbox Store", UUID.randomUUID(), 50.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/xbox.jpg", "R$ 50.00 Xbox Store"));
        createCard(new GiftCard(3L, "Xbox Store", UUID.randomUUID(), 75.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/xbox.jpg", "R$ 75.00 Xbox Store"));
        createCard(new GiftCard(4L, "Xbox Store", UUID.randomUUID(), 100.00, "https://github.com/GiftPlay/GiftPlayServer/blob/main/src/main/resources/images/xbox.jpg", "R$ 100.00 Xbox Store"));
    }

    public GiftCard getById(Long id) {
        return giftCardRepository.findById(id).orElse(null);
    }

    public void deleteCardById(Long id) {
        giftCardRepository.deleteById(id);
    }
}
