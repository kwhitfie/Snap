public class Card {
    String suit;
    String symbol;
    int value;

    Card(String suit, String symbol, int value){
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    @Override
    public String toString() {
        return suit + symbol;
    }
}
