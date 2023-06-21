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
        createCard(new GiftCard(null, "Apple", UUID.randomUUID(), 25.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/apple.jpg", "Tenha acesso a milhares de músicas, jogos, aplicativos, vídeos e muito mais!"));
        createCard(new GiftCard(null, "Apple", UUID.randomUUID(), 50.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/apple.jpg", "Tenha acesso a milhares de músicas, jogos, aplicativos, vídeos e muito mais!"));
        createCard(new GiftCard(null, "Apple", UUID.randomUUID(), 75.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/apple.jpg", "Tenha acesso a milhares de músicas, jogos, aplicativos, vídeos e muito mais!"));
        createCard(new GiftCard(null, "Apple", UUID.randomUUID(), 100.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/apple.jpg", "Tenha acesso a milhares de músicas, jogos, aplicativos, vídeos e muito mais!"));
    }
    private void createGooglePlay() {
        createCard(new GiftCard(null, "Google Play Store", UUID.randomUUID(), 25.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/googleplay.jpg", "Com os vale-presentes do Google Play você pode comprar filmes, livros, aplicativos, música e até carregar seu jogos com moedas virtuais!"));
        createCard(new GiftCard(null, "Google Play Store", UUID.randomUUID(), 50.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/googleplay.jpg", "Com os vale-presentes do Google Play você pode comprar filmes, livros, aplicativos, música e até carregar seu jogos com moedas virtuais!"));
        createCard(new GiftCard(null, "Google Play Store", UUID.randomUUID(), 75.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/googleplay.jpg", "Com os vale-presentes do Google Play você pode comprar filmes, livros, aplicativos, música e até carregar seu jogos com moedas virtuais!"));
        createCard(new GiftCard(null, "Google Play Store", UUID.randomUUID(), 100.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/googleplay.jpg", "Com os vale-presentes do Google Play você pode comprar filmes, livros, aplicativos, música e até carregar seu jogos com moedas virtuais!"));
    }

    private void createLol() {
        createCard(new GiftCard(null, "League of Legends", UUID.randomUUID(), 25.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/lol.jpg", "O Cartão Pré-Pago League of Legends Virtual permite que você participe do jogo e adquira conteúdos exclusivos mais rapidamente, como skins e campeões, agregando um maior status ao personagem durante as partidas do MOBA"));
        createCard(new GiftCard(null, "League of Legends", UUID.randomUUID(), 50.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/lol.jpg", "O Cartão Pré-Pago League of Legends Virtual permite que você participe do jogo e adquira conteúdos exclusivos mais rapidamente, como skins e campeões, agregando um maior status ao personagem durante as partidas do MOBA"));
        createCard(new GiftCard(null, "League of Legends", UUID.randomUUID(), 75.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/lol.jpg", "O Cartão Pré-Pago League of Legends Virtual permite que você participe do jogo e adquira conteúdos exclusivos mais rapidamente, como skins e campeões, agregando um maior status ao personagem durante as partidas do MOBA"));
        createCard(new GiftCard(null, "League of Legends", UUID.randomUUID(), 100.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/lol.jpg", "O Cartão Pré-Pago League of Legends Virtual permite que você participe do jogo e adquira conteúdos exclusivos mais rapidamente, como skins e campeões, agregando um maior status ao personagem durante as partidas do MOBA"));
    }

    private void createPsn() {
        createCard(new GiftCard(null, "PlayStation Network", UUID.randomUUID(), 25.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/psn.jpg", "O vale-presente da PlayStation Network é usado para adicionar fundos à carteira de qualquer conta da Sony Entertainment Network."));
        createCard(new GiftCard(null, "PlayStation Network", UUID.randomUUID(), 50.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/psn.jpg", "O vale-presente da PlayStation Network é usado para adicionar fundos à carteira de qualquer conta da Sony Entertainment Network."));
        createCard(new GiftCard(null, "PlayStation Network", UUID.randomUUID(), 75.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/psn.jpg", "O vale-presente da PlayStation Network é usado para adicionar fundos à carteira de qualquer conta da Sony Entertainment Network."));
        createCard(new GiftCard(null, "PlayStation Network", UUID.randomUUID(), 100.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/psn.jpg", "O vale-presente da PlayStation Network é usado para adicionar fundos à carteira de qualquer conta da Sony Entertainment Network."));
    }

    private void createSteam() {
        createCard(new GiftCard(null, "Steam", UUID.randomUUID(), 25.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/steam.jpg", "Steam é uma plataforma de jogos, onde você pode encontrar mais de 30.000 jogos, indo de grandes produções até pequenos independentes"));
        createCard(new GiftCard(null, "Steam", UUID.randomUUID(), 50.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/steam.jpg", "Steam é uma plataforma de jogos, onde você pode encontrar mais de 30.000 jogos, indo de grandes produções até pequenos independentes"));
        createCard(new GiftCard(null, "Steam", UUID.randomUUID(), 75.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/steam.jpg", "Steam é uma plataforma de jogos, onde você pode encontrar mais de 30.000 jogos, indo de grandes produções até pequenos independentes"));
        createCard(new GiftCard(null, "Steam", UUID.randomUUID(), 100.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/steam.jpg", "Steam é uma plataforma de jogos, onde você pode encontrar mais de 30.000 jogos, indo de grandes produções até pequenos independentes"));
    }

    private void createXbox() {
        createCard(new GiftCard(null, "Xbox Store", UUID.randomUUID(), 25.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/xbox.jpg", "Com um cartão-presente do Xbox, o jogador tem a liberdade de escolher o presente que quiser – mesmo se o jogador for você"));
        createCard(new GiftCard(null, "Xbox Store", UUID.randomUUID(), 50.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/xbox.jpg", "Com um cartão-presente do Xbox, o jogador tem a liberdade de escolher o presente que quiser – mesmo se o jogador for você"));
        createCard(new GiftCard(null, "Xbox Store", UUID.randomUUID(), 75.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/xbox.jpg", "Com um cartão-presente do Xbox, o jogador tem a liberdade de escolher o presente que quiser – mesmo se o jogador for você"));
        createCard(new GiftCard(null, "Xbox Store", UUID.randomUUID(), 100.00, "https://raw.githubusercontent.com/GiftPlay/GiftPlayServer/main/src/main/resources/images/xbox.jpg", "Com um cartão-presente do Xbox, o jogador tem a liberdade de escolher o presente que quiser – mesmo se o jogador for você"));
    }

    public GiftCard getById(Long id) {
        return giftCardRepository.findById(id).orElse(null);
    }

    public void deleteCardById(Long id) {
        giftCardRepository.deleteById(id);
    }
}
