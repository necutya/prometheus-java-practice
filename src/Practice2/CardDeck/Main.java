package Practice2.CardDeck;



public class Main
{
    public static void main(String[] args)
    {
        Deck deck = new Deck();
        while(deck.hasNext()) {
            System.out.println(deck.drawOne());
        }
    }
}