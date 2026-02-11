import java.util.Scanner;

public class Snap extends CardGame{

    Scanner scanner;
    Card lastCard;
    Card currentCard;
    boolean player1 = false;

    Snap() {
        super("Snap");
    }

    /**
     Shuffles the deck and the game
     */
    void start(){
        scanner = new Scanner(System.in);
        shuffleDeck();
        System.out.println("\n Welcome to snap! Type 'snap' when a matching symbol is drawn to win. \n Press enter to draw a card. Player 1 is up first. ");
        nextTurn();
    }

    /**
    @return String representation of the current player
     */
    String getPlayer(){
        if(player1){
            return "Player 1";
        }
        return "Player 2";
    }

    /**
     Proceeds to the next turn of the game by flipping to the next player, drawing a card and checking if they match.
     */
    void nextTurn(){

        //Toggle player boolean each turn
        player1 = !player1;
        String input = scanner.nextLine();

        //If the player types snap without a match occurring, automatically lose. Stops user from typing
        //snap every turn until they win.
        if(input.trim().equalsIgnoreCase("snap")){
            System.out.println("Cards do not match. "+getPlayer()+" wins.");
            return;
        }

        //Draw card and save information on the current card and last card
        lastCard = currentCard;
        currentCard = dealCard();
        System.out.print(getPlayer()+ " draws " +currentCard +" ");

        //Last card will be null if it's the first turn so go straight to the next turn without checks in that case
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

    /**
     Is called once a match is detected. Checks whether player has typed snap within 2 seconds, else the other player wins.
     */
    void snap() {

        //Check the time between the card being printed and the user giving an input
        System.out.println();
        long startTime = System.currentTimeMillis();
        String input = scanner.nextLine();
        long endTime = System.currentTimeMillis();

        long snapTime = endTime-startTime;

        // If the player answers "snap" in time, they win.
        //If they don't type snap or are too slow, the other player wins.

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
