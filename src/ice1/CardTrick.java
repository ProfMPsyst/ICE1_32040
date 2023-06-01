/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ice1;


import java.util.Random;


/**A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Megha Patel,2023
 * @modifier Khushpreet Kaur, 991685679
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
            c.setValue(randomNumber());
            c.setSuit(Card.SUITS[randomNumber(0, 3)]);
            
            magicHand[i] = c;

            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
         // Ask the user for card value and suit
        
       
        String luckyCard = "Diamonds 6";
       String[] splitCard = luckyCard.split(" ");
      String s = splitCard[0];
    int v = Integer.parseInt(splitCard[1]);
        
      boolean found = false;
      
      for (int i = 0; i < magicHand.length; i++) {
         if (s.equals(magicHand[i].getSuit()) && v == magicHand[i].getValue()) {
            found = true;
           break;
           }
         }
       
       if (found) {
          System.out.println("Yes, the user’s card is in the magic hand of random cards.");
       } else {
            System.out.println("Sorry, the user’s card is not in the magic hand of random cards.");
       }
      
        System.out.print("Guess Card Suit Number (0-3): ");
        
        System.out.println("Magic Hand:");
        
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
            
        }
    }
        private static int randomNumber() {
        Random random = new Random();
        return random.nextInt(13) + 1; 
    }
    
    private static int randomNumber(int a, int b) {
        Random random = new Random();
        return random.nextInt(b - a + 1) + a; 
        }
        //Then report the result here
    }



