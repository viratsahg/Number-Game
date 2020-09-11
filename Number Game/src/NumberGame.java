import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;
        System.out.println("I have randomly choosen a number between 1 and 100.");
        System.out.println("Try to guess it.");

        Scanner obj = new Scanner(System.in);
        for(int i=10; i>0; i--){
            System.out.println("You have "+i+" guess(es) left. Choose again:");
            int guess = obj.nextInt();

            if(randomNumber < guess){
                System.out.println("It's smaller than "+guess+".");
            }
            if(randomNumber > guess){
                System.out.println("It's bigger than "+guess+".");
            }
            if(randomNumber == guess){
                hasWon = true;
                break;
            }
        }
        if(hasWon){
            System.out.println("CORRECT.... You Won");
        }
        else{
            System.out.println("GAME OVER..... You Loose");
            System.out.println("The number was "+randomNumber);
        }
    }
}
