/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ice1;
import java.util.Scanner;

/**A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Megha Patel,2023
 * @modifier Hrithik Solanki
 * @ID: 991675493
 */
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for(int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here
            c.setValue( (int) (Math.random() *13) +1);
            //c.setValue(insert call to random number generator here
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);magicHand[i] = c;
        }
        //insert code to ask the user for Card value and suit, create their card
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card (1-13): ");
        int value = scanner.nextInt();
        scanner.nextLine(); // Consuming the newline character

        System.out.print("Enter the suit of your card (Hearts, Diamonds, Clubs, Spades): ");
        String suit = scanner.nextLine();
        // and search magicHand here
        
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(suit);
        //Then report the result here

        
        boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Congratulations, Your card is in the magic hand!");
        } else {
            System.out.println("Unfortunately, Your card is not in the magic hand. Better Luck Nect Time");
        }
    }
}