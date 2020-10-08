package Practice2.CardDeck;

import java.util.*;

public class Deck {
    private Card[] cards;
    int topCard;

    public Deck() {
        cards = new Card[36];

        for (int i = 0; i < Rank.values.length * Suit.values.length; i++) {
            cards[i]= new Card(Rank.values[i % Rank.values.length], Suit.values[i % Suit.values.length]);
        }

        topCard = cards.length;
    }

    public void shuffle() {
        List<Card> tempList = Arrays.asList(cards);
        Collections.shuffle(tempList);
        tempList.toArray(cards);
    }
    /* * Впорядкування колоди за мастями та значеннями
     * Порядок сотрування:
     * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
     * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
     * Наприклад
     * HEARTS Ace
     * HEARTS King
     * HEARTS Queen
     * HEARTS Jack
     * HEARTS 10
     * HEARTS 9
     * HEARTS 8
     * HEARTS 7
     * HEARTS 6
     * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {
        int k=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                cards[k] = new Card(Rank.values[j],Suit.values[i]);
                k++;
            }
        }

    }



    public boolean hasNext() {
        return topCard > 0;
    }


    public Card drawOne() {
        if (hasNext()) {
            return cards[--topCard];
        } else {
            return null;
        }
    }
}


