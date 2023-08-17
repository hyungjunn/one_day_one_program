package DAY_014.CardGame;

class CardGame {
    static String rankCheck(Card[] card) {
        String rank = "";

        // 8. "STRAIGHT FLUSH" 같은 무늬면서 연속 숫자
        if (card[0].kind == card[1].kind
                && card[1].kind == card[2].kind
                && card[2].kind == card[3].kind
                && card[3].kind == card[4].kind
                && card[0].num + 1 == card[1].num
                && card[1].num + 1 == card[2].num
                && card[2].num + 1 == card[3].num
                && card[3].num + 1 == card[4].num)
        { return "STRAIGHT FLUSH"; }

        // 7. "FLUSH" 같은 무늬 5장
        if (card[0].kind == card[1].kind
                && card[1].kind == card[2].kind
                && card[2].kind == card[3].kind
                && card[3].kind == card[4].kind)
        { return "FLUSH"; }


        int[] counter = new int[13]; // 카드 몇개가 조건에 일치하는지 알아내기 위한 카운트도구

        for (int i = 0; i < card.length; i++) {
            counter[card[i].num]++;
        }

        for (int i = 0; i < counter.length; i++) {

            if (counter[i] == 1 && counter[i + 1] == 1 && counter[i + 2] == 1 && counter[i + 3] == 1 && counter[i + 4] == 1) { return "STRAIGHT"; }
            // 6. "STRAIGHT" 연속 숫자 5장

            if (counter[i] == 4) { return "FOUR CARD"; }// 5. "FOUR CARD" 같은 카드 4장

            if (counter[i] == 3) { return "THREE CARD"; }// 4. "THREE CARD" 같은 카드 3장

            if (counter[counter[i]] == 2) { return "2 PAIR"; } // 3. "2 PAIR" 같은 숫자 한쌍

            if (counter[i] == 2) { return "1 PAIR"; }    // 2. "1 PAIR" 같은 숫자 한쌍

            if (counter[i] == 1) { return "NO RANK"; }   // 1. "NO RANK"

        }

        return rank;
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
