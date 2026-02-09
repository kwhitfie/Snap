import java.util.Scanner;

public class Snap extends CardGame{

    Scanner scanner;
    Card lastCard;
    Card currentCard;

    Snap() {
        super("Snap");
    }

    void start(){
        scanner = new Scanner(System.in);
        shuffleDeck();
        System.out.println("Welcome to snap! Press enter to draw a card. \nThe game will end when a matching symbol is drawn.");
        nextTurn();
    }

    void nextTurn(){
        scanner.nextLine();
        lastCard = currentCard;
        currentCard = dealCard();
        System.out.println("You draw: "+currentCard);
        if(lastCard!=null){
            if(currentCard.suit.equals(lastCard.suit)){
                System.out.println("Snap! You win!");
            }
            else {
                nextTurn();
            }
        }
        else {
            nextTurn();
        }

    }
}
