import java.util.Random;
import java.util.Scanner;
public class GuessingNumber {
   public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        byte guess,userGuess,attempts;
        boolean playAgain = true;
        String userChoice;
        System.out.println("Welcome to My Game!(Guessing numbers between 1 to 50).  Have fun!!");
        while (playAgain) {
            guess = (byte)random.nextInt(1,51);
            attempts = 0;
            while (true) {
                System.out.print("Enter your guess : ");
                try{
                    userGuess = scanner.nextByte();
                    scanner.nextLine();
                    attempts++;
                    if(userGuess > guess){
                       System.out.println("Guess is too High!");
                    }
                    else if(userGuess < guess){
                        System.out.println("Guess is too low!");
                    }
                    else{
                        System.out.println("Excellent! You guessed the correct number in " + attempts + (attempts > 1 ? " attempts" : " attempt"));
                        break;
                    }
                }
                catch(Exception e){
                    System.out.println("Oops! That's not a valid Input. Try Again!");
                    scanner.nextLine();
                }
            }
            System.out.print("Wanna play again!(yes/no) : " );
            userChoice = scanner.nextLine();
            if(userChoice.equalsIgnoreCase("yes")){
                playAgain = true;
            }
            else{
                System.out.println("Thanks for playing!!");
                playAgain = false;
            }
        }
        scanner.close();
   } 
}
