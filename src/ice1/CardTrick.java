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
 * @modifier Prerna Prerna,2023
 * Student id:991699987
 */
import java.util.Scanner;
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        for(int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card (1-13): ");
        int userValue = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the suit of your card(0-3): ");
        String userSuit = scanner.nextLine();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        
        Card luckyCard = new Card();  
        luckyCard.setValue(7);     
        luckyCard.setSuit(Card.SUITS[2]); 

        boolean found = false;

        for (int i = 0; i < magicHand.length; i++) {
            if (userCard.getValue() == magicHand[i].getValue() && userCard.getSuit().equals(magicHand[i].getSuit())) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Yes, the user's card is in the magic hand of random cards.");
        } else {
            System.out.println("Sorry, the user's card is not in the magic hand of random cards.");
        }
        if (luckyCard.getValue() == userCard.getValue() && luckyCard.getSuit().equals(userCard.getSuit())) {
            System.out.println("Congratulations! You found the lucky card!");
        } else {
            System.out.println("The lucky card is not your card.");}
    }

}
