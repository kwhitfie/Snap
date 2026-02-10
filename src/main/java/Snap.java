import java.util.Locale;
import java.util.Scanner;
import java.util.Timer;

public class Snap extends CardGame{

    Scanner scanner;
    Card lastCard;
    Card currentCard;
    boolean player1 = false;

    Snap() {
        super("Snap");
    }

    void start(){
        scanner = new Scanner(System.in);
        shuffleDeck();
        System.out.println("\nWelcome to snap! Press enter to draw a card. \nThe game will end when a matching symbol is drawn.");
        nextTurn();
    }

    String getPlayer(){
        if(player1){
            return "Player 1";
        }
        return "Player 2";
    }

    void nextTurn(){
        player1 = !player1;
        scanner.nextLine();
        lastCard = currentCard;
        currentCard = dealCard();
        System.out.print(getPlayer()+ " draws " +currentCard);
        if(lastCard!=null){
            if(currentCard.suit.equals(lastCard.suit)){
                    snap();
            }
            else {
                nextTurn();
            }
        }
        else {
            nextTurn();
        }

    }

    void snap() {
        System.out.println();
        long startTime = System.currentTimeMillis();
        String input = scanner.nextLine();
        long endTime = System.currentTimeMillis();

        long snapTime = endTime-startTime;

        if(input.trim().equalsIgnoreCase("snap")){
            if(snapTime <= 2000){
                System.out.println(getPlayer()+" wins!");
            }
            else{
                player1 = !player1;
                System.out.println("Too slow! "+getPlayer()+" wins!");
            }
        }
        else{
            player1 = !player1;
            System.out.println("You didn't say 'Snap'! "+getPlayer()+" wins!");
        }

    }
}
