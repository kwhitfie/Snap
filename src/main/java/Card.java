public class Card {
    String suit;
    String symbol;
    int value;

    Card(String suit, String symbol){
        this.suit = suit;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol + suit;
    }
}
