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
 * @modifier Sanjana Reddy kotha
 */
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Scanner in = new Scanner(System.in);
        
        for(int i=0; i<magicHand.length; i++)
        {
            System.out.print(" User Suit = ");
             String s = in.next();
             System.out.print("User value = ");
             int v= in.nextInt();
             
             System.out.println("User Card = "+ s + " " + v);
            Card c = new Card();
            c.setValue((int) (Math.random()*13+1));//c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[(int) (Math.random()*3+0)]); //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i]=c;
            System.out.println("Random Card = "+ magicHand[i].getSuit()+ " " +magicHand[i].getValue());
            
            String luckyCard = "Diamonds 6";
            
            if ((s+" "+v).equals(magicHand[i].getSuit()+ " " +magicHand[i].getValue()) || (luckyCard.equals(magicHand[i].getSuit()+ " " +magicHand[i].getValue()))){
                System.out.println("Yes, the user’s card is in the magic hand of random cards.");
            }
            else {
                System.out.println("Sorry, the user’s card is not in the magic hand of random cards.");
            }
        }
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
