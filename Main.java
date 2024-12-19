import javax.swing.JOptionPane;
import java.util.Random;

public class Main
{
   public static void main(String[] args)
   {
      String computer;
      String user;
      
      // Play the game as long as there is a tie.
      do
      {
         // Get the computer's choice.
         computer = computerChoice();
         
         // Get the user's choice.
         user = userChoice();
         
         // Determine the winner.
         determineWinner(computer, user);
      }while(user.equalsIgnoreCase(computer));
      
      // Exit the program.
      System.exit(0);
   }
   
   /**
      computerChoice method
      @return The computer's choice of "rock",
              "paper", or "scissors".
   */
   public static String computerChoice()
   {

   }
   
   /**
      userChoice method
      @return The user's choice of "rock",
              "paper", or "scissors".
   */
   public static String userChoice()
   {
 
   }
   
   /**
      isValidChoice method
      @param choice A string holding the user's choice.
      @return true if the choice is valid, false otherwise.
   */
   public static boolean isValidChoice(String choice)
   {
 
   }
   
   /**
      The determineWinner method displays the winner.
      @param computer The computer's choice.
      @param user The user's choice.
   */
   public static void determineWinner(String computer, String user)
   {
 
   }
}