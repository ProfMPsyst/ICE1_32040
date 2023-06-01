/* Name: Diya Singh Mavi
   Student No.: 991709323
*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ice1;

/**A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Diya Singh Mavi,2023
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
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue((int) (Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        int userCardValue = (int) (Math.random() * 13) + 1;
        int userCardSuit = (int) (Math.random() * 4);

        Card luckyCard = new Card();
        luckyCard.setValue(3);
        luckyCard.setSuit("Spade");

        boolean searchMatch = false;

        for (Card card : magicHand) {
            if (luckycard.getValue() == luckyCard.getValue() && luckycard.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                searchMatch = true;
                break;
            }
        }

        if (searchMatch) {
            System.out.println("Wow! The lucky card found .");
        } else {
            System.out.println("Unfortunately,The lucky card was not found.");
        }
    }

}
