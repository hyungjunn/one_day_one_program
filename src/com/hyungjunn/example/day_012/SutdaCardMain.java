package com.hyungjunn.example.day_012;

class SutdaCardMain {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }
    }
}
