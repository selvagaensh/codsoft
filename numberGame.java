import java.lang.System;
import java.util.*;
public class numberGame {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random number = new Random();
        int randomNumber = number.nextInt(100);
        boolean guessed = false;
        int count = 10;
        while(!guessed){
            System.out.println("Enter your Guessing Number : ");
            int userNumber = scan.nextInt();
            count--;
            if(userNumber == randomNumber){
                guessed = true;
                System.out.println("You are answer is correct");
            }
            
            else if(count == 0){
                System.out.println("Game Over");
                break;
            }
            else if(randomNumber > userNumber){
                System.out.println("Try Some Big Values");
            }
            else{
                System.out.println("Try Some Small Values");
            }
        }
        
        scan.close();
    }
}
