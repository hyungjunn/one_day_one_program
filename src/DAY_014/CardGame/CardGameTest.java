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

    @DisplayName("같은 무늬 5장")
    @Test
    void flushTest() {
        Card[] cards = {new Card("HEART", 1), // cards[0]
                new Card("HEART", 7), // cards[1]
                new Card("HEART", 4), // cards[2]
                new Card("HEART", 4), // cards[3]
                new Card("HEART", 5)  // cards[4]
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
}