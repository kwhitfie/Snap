import java.util.ArrayList;

public class CardGame {

    ArrayList<Card> deck;
    String name;

    CardGame(String name) {
        this.name = name;
        //Populate deck with cards
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

    public ArrayList<Card> shuffleDeck(){
        return null;
    }
}
