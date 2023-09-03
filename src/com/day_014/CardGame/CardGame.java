package com.day_014.CardGame;

class CardGame {
    static String rankCheck(Card[] card) {
        int count = 0;
        int pair = 0;

        int[] counter = new int[13]; // card[i].num가 조건에 일치하는지 알아내기 위한 카운트도구
        int[] counter2 = new int[4]; // card[i].kind가 조건에 일치하는지 알아내기 위한 카운트도구

        for (int i = 0; i < 4; i++) {
            if (card[i].kind == card[i + 1].kind) {
                counter2[0]++;
            }
        }

        for (int i = 0; i < card.length; i++) {
            counter[card[i].num]++;
        }
        // 8. "STRAIGHT FLUSH" 같은 무늬면서 연속 숫자
        for (int i = 0; i < 4; i++) {
            if (card[i].num + 1 == card[i + 1].num && counter2[0] == 4) {
                return "STRAIGHT FLUSH";
            }
        }

        // 7. "FLUSH" 같은 무늬 5장
        for (int i = 0; i < 4; i++) {
            if (counter2[0] == 4) {
                return "FLUSH";
            }
        }

        for (int i = 0; i < counter.length; i++) {// 6. "STRAIGHT" 연속 숫자 5장
            if (counter[i] == 1 && counter[i + 1] == 1 && counter[i + 2] == 1 && counter[i + 3] == 1 && counter[i + 4] == 1) {
                return "STRAIGHT";
            }
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == 4) {
                return "FOUR CARD";
            }// 5. "FOUR CARD" 같은 카드 4장
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == 3) {
                return "THREE CARD";
            }// 4. "THREE CARD" 같은 카드 3장
        }


        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == 2) {
                pair++;
            }
        }

        if (pair == 2) {return "2 PAIR";}
        if (pair == 1) {return "1 PAIR";}

        return "NO RANK";
    }

    public static void main(String[] args) {
        Card[] cards = {new Card("HEART", 1), // cards[0]
                new Card("HEART", 2), // cards[1]
                new Card("HEART", 3), // cards[2]
                new Card("HEART", 4), // cards[3]
                new Card("HEART", 5)  // cards[4]
        };
        System.out.println(rankCheck(cards));
    }
}
