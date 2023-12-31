package com.hyungjunn.example.day_012;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            // cards[0] = 1K
            // cards[1] = 2
            // cards[2] = 3K
            // cards[3] = 4
            // ...
            // cards[9] = 10 -> 순환
            // cards[10] = 1
            // ...
            // cards[19] = 10
            int num = i % 10 + 1;

            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);

            cards[i] = new SutdaCard(num, isKwang);
        }
    }
}
