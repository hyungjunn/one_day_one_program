package DAY_014.CardGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static DAY_014.CardGame.CardGame.rankCheck;
import static org.junit.jupiter.api.Assertions.*;

class CardGameTest {


    @DisplayName("같은 무늬면서 연속 숫자")
    @Test
    void straightFlushTest() {
        Card[] cards = {new Card("HEART", 1), // cards[0]
                new Card("HEART", 2), // cards[1]
                new Card("HEART", 3), // cards[2]
                new Card("HEART", 4), // cards[3]
                new Card("HEART", 5)  // cards[4]
        };

        assertTrue(rankCheck(cards) == "STRAIGHT FLUSH");
    }

    @DisplayName("같은 무늬면서 연속 숫자")
    @Test
    void straightFlushTest1() {
        Card[] cards = {new Card("DIAMOND", 4), // cards[0]
                new Card("DIAMOND", 5), // cards[1]
                new Card("DIAMOND", 6), // cards[2]
                new Card("DIAMOND", 7), // cards[3]
                new Card("DIAMOND", 8)  // cards[4]
        };

        assertTrue(rankCheck(cards) == "STRAIGHT FLUSH");
    }

    @DisplayName("같은 무늬면서 연속 숫자")
    @Test
    void straightFlushTest2() {
        Card[] cards = {new Card("CLOVER", 4), // cards[0]
                new Card("CLOVER", 5), // cards[1]
                new Card("CLOVER", 6), // cards[2]
                new Card("CLOVER", 7), // cards[3]
                new Card("CLOVER", 8)  // cards[4]
        };

        assertTrue(rankCheck(cards) == "STRAIGHT FLUSH");
    }

    @DisplayName("같은 무늬면서 연속 숫자")
    @Test
    void straightFlushTest3() {
        Card[] cards = {new Card("SPADE", 4), // cards[0]
                new Card("SPADE", 5), // cards[1]
                new Card("SPADE", 6), // cards[2]
                new Card("SPADE", 7), // cards[3]
                new Card("SPADE", 8)  // cards[4]
        };

        assertTrue(rankCheck(cards) == "STRAIGHT FLUSH");
    }


    @DisplayName("같은 무늬 5장")
    @Test
    void flushTest1() {
        Card[] cards = {new Card("SPADE", 1), // cards[0]
                new Card("SPADE", 7), // cards[1]
                new Card("SPADE", 4), // cards[2]
                new Card("SPADE", 4), // cards[3]
                new Card("SPADE", 5)  // cards[4]
        };

        assertTrue(rankCheck(cards) == "FLUSH");
    }

    @DisplayName("같은 무늬 5장")
    @Test
    void flushTest2() {
        Card[] cards = {new Card("HEART", 1), // cards[0]
                new Card("HEART", 7), // cards[1]
                new Card("HEART", 4), // cards[2]
                new Card("HEART", 4), // cards[3]
                new Card("HEART", 5)  // cards[4]
        };

        assertTrue(rankCheck(cards) == "FLUSH");
    }

    @DisplayName("같은 무늬 5장")
    @Test
    void flushTest3() {
        Card[] cards = {new Card("CLOVER", 1), // cards[0]
                new Card("CLOVER", 7), // cards[1]
                new Card("CLOVER", 4), // cards[2]
                new Card("CLOVER", 4), // cards[3]
                new Card("CLOVER", 5)  // cards[4]
        };

        assertTrue(rankCheck(cards) == "FLUSH");
    }

    @DisplayName("연속 숫자 5장")
    @Test
    void straightTest() {
        Card[] cards = {new Card("HEART", 1), // cards[0]
                new Card("HEART", 2), // cards[1]
                new Card("DIAMOND", 3), // cards[2]
                new Card("HEART", 4), // cards[3]
                new Card("HEART", 5)  // cards[4]
        };

        assertTrue(rankCheck(cards) == "STRAIGHT");
    }

    @DisplayName("같은 카드 4장")
    @Test
    void fourCardTest() {
        Card[] cards = {new Card("HEART", 1), // cards[0]
                new Card("CLOVER", 1), // cards[1]
                new Card("DIAMOND", 1), // cards[2]
                new Card("SPADE", 1), // cards[3]
                new Card("HEART", 5)  // cards[4]
        };

        assertTrue(rankCheck(cards) == "FOUR CARD");
    }

    @DisplayName("같은 카드 3장")
    @Test
    void threeCardTest() {
        Card[] cards = {new Card("HEART", 1), // cards[0]
                new Card("CLOVER", 1), // cards[1]
                new Card("DIAMOND", 1), // cards[2]
                new Card("SPADE", 4), // cards[3]
                new Card("HEART", 5)  // cards[4]
        };

        assertTrue(rankCheck(cards) == "THREE CARD");
    }

    @DisplayName("같은 숫자 두쌍")
    @Test
    void twoPairTest() {
        Card[] cards = {new Card("HEART", 1), // cards[0]
                new Card("CLOVER", 1), // cards[1]
                new Card("DIAMOND", 2), // cards[2]
                new Card("SPADE", 2), // cards[3]
                new Card("HEART", 5)  // cards[4]
        };

        assertTrue(rankCheck(cards) == "2 PAIR");
    }

    @DisplayName("같은 숫자 한쌍")
    @Test
    void onePairTest() {
        Card[] cards = {new Card("HEART", 1), // cards[0]
                new Card("CLOVER", 1), // cards[1]
                new Card("DIAMOND", 3), // cards[2]
                new Card("SPADE", 2), // cards[3]
                new Card("HEART", 5)  // cards[4]
        };

        assertTrue(rankCheck(cards) == "1 PAIR");
    }

    @DisplayName("아무것도 해당되지 않음.")
    @Test
    void noRankTest() {
        Card[] cards = {new Card("HEART", 1), // cards[0]
                new Card("CLOVER", 8), // cards[1]
                new Card("DIAMOND", 3), // cards[2]
                new Card("SPADE", 9), // cards[3]
                new Card("HEART", 5)  // cards[4]
        };

        assertTrue(rankCheck(cards) == "NO RANK");
    }

    @DisplayName("아무것도 해당되지 않음.")
    @Test
    void noRankTest1() {
        Card[] cards = {new Card("HEART", 9), // cards[0]
                new Card("CLOVER", 7), // cards[1]
                new Card("DIAMOND", 3), // cards[2]
                new Card("SPADE", 1), // cards[3]
                new Card("HEART", 5)  // cards[4]
        };

        assertTrue(rankCheck(cards) == "NO RANK");
    }
}