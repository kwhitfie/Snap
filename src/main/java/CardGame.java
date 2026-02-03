import java.util.ArrayList;

public class CardGame {

    ArrayList<Card> deck = new ArrayList<>();
    String name;

    CardGame(String name) {
        this.name = name;
        //Populate deck with cards
        String[] suits = {"♣", "♥", "♦", "♣"};
        String[] symbols = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        for(String suit:suits){
            for(String symbol:symbols){
                deck.add(new Card(suit,symbol));
            }
        }

        System.out.println(deck);
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public Card dealCard(){
        return null;
    }

    public ArrayList<Card> sortDeckIntoSuits(){
        return null;
    }

    public ArrayList<Card> sortDeckInNumberOrder(){
        return null;
    }

    public ArrayList<Card> shuffleDeck(){
        return null;
    }
}
