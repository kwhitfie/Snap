import java.util.ArrayList;
import java.util.Collections;

public class CardGame {

    public ArrayList<Card> deck = new ArrayList<>();
    String name;

    CardGame(String name) {
        this.name = name;
        //Populate deck with cards
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] symbols = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        int i = 2;
        for(String suit:suits){
            for(String symbol:symbols){
                deck.add(new Card(suit,symbol,i));
                i++;
            }
            i = 2;
        }
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public Card dealCard(){
        return null;
    }

    public ArrayList<Card> sortDeckIntoSuits(){
        deck.sort((a, b) -> a.suit.compareTo(b.suit));
        return deck;
    }

    public ArrayList<Card> sortDeckInNumberOrder(){
        deck.sort((a, b) -> a.value - b.value );
        return deck;
    }

    public ArrayList<Card> shuffleDeck(){
        return null;
    }
}
