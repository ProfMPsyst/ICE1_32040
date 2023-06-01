
package ice1;

import java.util.Random;
import java.util.Scanner;

/**A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Megha Patel,2023
 * @modifier Karan Kaushal 
 * Student ID Number: 991676255
 */

public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magic = new Card[7];
        
        Scanner sc = new Scanner(System.in);
        
        Random rand = new Random();
        for(int i=0; i<magic.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13));
            int SUITs = rand.nextInt(4);
            c.setSuit(Card.SUITS[SUITs]);
            
            magic[i] = c;

        }
        
        
        System.out.print("Enter your Selection(1-13): ");
        int value = sc.nextInt();
        System.out.print("Enter suite value (Hearts, Diamonds, Clubs, Spades) : ");
        String cardsuite = sc.next();

        // and search magicHand here
         Card user = new Card();
        user.setSuit(cardsuite);
        user.setValue(value);
        
        //Then report the result here
        boolean win = false;
        for(Card card : magic){
            if(card.equals(user))
            {
                win = true; 
            }
        }
        if(win){
            System.out.println("Congratulations! Your Card is in the Magic Hand!!!");
        }
        else{
            System.out.println("Sorry, Your Card is not in the Magic Hand!!!");
        }
    }
}