/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice1;
import java.util.Random;
import java.util.Scanner;
/**A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Khushleen kaur 1st June, 2023
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
            Random random = new Random();
            c.setValue(random.nextInt(13) + 1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of the card you want to pick (1-13): ");
        int value = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the suit of the card you want to pick (Clubs, Hearts, Spades, Diamonds): ");
        String suit = scanner.nextLine();
        
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(suit);

        boolean foundMatch = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                foundMatch = true;
                break;
            }
        }

        if (foundMatch) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry! Your card is not in the magic hand.");
        }
    }
}
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    
