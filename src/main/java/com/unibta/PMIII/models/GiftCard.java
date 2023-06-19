package com.unibta.PMIII.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "tb_gift_card")
public class GiftCard {
    @Id
    private Long id;
    private String company;
    private UUID cardNumber;
    private Double price;
    private String image;
    private String description;

    public GiftCard() {

    }

    public GiftCard(Long id, String company, UUID cardNumber, Double price, String image, String description) {
        this.id = id;
        this.company = company;
        this.cardNumber = cardNumber;
        this.price = price;
        this.image = image;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public UUID getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(UUID cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
