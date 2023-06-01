/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ice1;

/**A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Megha Patel,2023
 */

import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    /**
     * @param args the command line arguments
     */
    
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        for(int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random random = new Random();
            c.setValue(random.nextInt(13) + 1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
        }
        
        Scanner scanner = new Scanner(System.in);
        Card luckyCard= new card();
        luckyCard.setValue=5;
        luckyCard.setSuit="hearts";
        System.out.print("Pick a card (enter the value of your card - 1 to 13): ");
        int userValue = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter the suit of your card (Hearts, Diamonds, Clubs, Spades): ");
        String userSuit = scanner.nextLine();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry! Your card is not in the magic hand.");
        }
        
    }

}
