package com.unibta.PMIII.models;

import java.util.List;

public class GiftCardDtoMobile {
    List<GiftCard> giftCardList;

    public GiftCardDtoMobile() {
    }

    public GiftCardDtoMobile(List<GiftCard> giftCardList) {
        this.giftCardList = giftCardList;
    }

    public List<GiftCard> getGiftCardList() {
        return giftCardList;
    }

    public void setGiftCardList(List<GiftCard> giftCardList) {
        this.giftCardList = giftCardList;
    }
}
