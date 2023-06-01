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
 * @ modifier Arshdeep kaur, 991683798
 */
import java.util.Random;
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        for(int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(generateRandomNumber());
            c.setSuit(Card.SUITS[generateRandomNumber(0, 3)]);
            magicHand[i] = c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
         System.out.println("magic hand:");
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " & " + card.getSuit());
            //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        }
    }
           private static int generateRandomNumber() {
        Random r = new Random();
        return r.nextInt(13) + 1; // Generates a random number between 1 and 13
    }
    
    private static int generateRandomNumber(int x, int y) {
        Random a = new Random();
        return a.nextInt(y - x + 1) + x; 
        }
        //Then report the result here
    }
