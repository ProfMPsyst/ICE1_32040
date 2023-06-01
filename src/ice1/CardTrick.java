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
 * @modifier Avinashdeep Singh
 * Student Number = 991709300 
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
            c.setValue((int) (Math.random()* 13) + 1);
           
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i]=c;
           
        }
        
        //insert code to ask the user for Card value and suit, create their card
       //insert code to ask the user for Card value and suit, create their card
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card: ");
        int userValue = scanner.nextInt();
        System.out.print("Enter the suit of your card (0-3): ");
        int userSuit = scanner.nextInt();
        */
          System.out.print("Pick any card: ");
        //Creating user's card
        /*
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);// suits are already pre-defined in "SUITS" array
        */
         //Hard coding luckyCard in the git repository
        Card luckyCard = new Card();
        luckyCard.setValue(7); 
        luckyCard.setSuit(Card.SUITS[3]);
        
        // and search magicHand here
         boolean foundMatch=false;
        for(int i = 0; i < magicHand.length; i++)
        {
            if (magicHand[i].equals(luckyCard))
            {
            foundMatch = true;
            break;
            }
        }
        
        //Then report the result here
        
        if(foundMatch)
            System.out.println("Your card is in the magic hand!");
        else
            System.out.println("Your card is not in the magic hand");
       
        
        
    }
}



     
        

       





