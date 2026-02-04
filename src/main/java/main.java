public class main {

    static void main(String[] args) {
        CardGame cg = new CardGame("Snap");
        cg.sortDeckInNumberOrder();
        System.out.println("Number order: "+cg.deck);

        cg.sortDeckIntoSuits();
        System.out.println("Suit order: "+cg.deck);

        cg.shuffleDeck();
        System.out.println("Shuffled: "+cg.deck);

        System.out.println("Deal card: "+cg.dealCard());

    }
}
