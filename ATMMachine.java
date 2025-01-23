import java.lang.System;
import java.util.*;

public class ATMMachine extends UserBankAccount{
    
     static float withDrawing (float amount){
        try{
        if(amount > accountBalance){
             throw new Exception("Account Balance is insufficient");
        }
        else{
        accountBalance = accountBalance - amount;
        System.out.print("Your Balance is : ");
        return accountBalance;
        }
        }
        catch(Exception e){
            System.out.println(e);
            System.out.print("Your Account Balance is : ");
            return accountBalance;
        } 
    }
    static float Deposit(float amount){
        accountBalance = accountBalance + amount;
        System.out.println("Your Amount has been Deposited");
        System.out.print("Your Balance is : ");
        return accountBalance;
    }
    static float checkBalance (){
        return accountBalance;
    }
    public static void main(String[] args){
        boolean isExit = false;
        Scanner scan = new Scanner(System.in);
        
        while(!isExit){
            System.out.println("Enter 1 : WithDrawing");
            System.out.println("Enter 2 : Deposit");
            System.out.println("Enter 3 : checkBalance");
            System.out.println("Enter 4 : Exit");
            System.out.print("Choose your options : ");

            int userChoice = -1;

            while(userChoice <1 || userChoice>4){
                try{
                    userChoice = scan.nextInt();
                    if(userChoice <1 || userChoice>4){
                        System.out.println("Invalid choice. Please choose a number between 1 and 4.");
                    }
                }
                catch(InputMismatchException e){
                    System.out.println(e);
                    scan.nextLine();
                }
            }
            switch(userChoice){
                case 1 :
                    System.out.println("Enter the amount for Withdraw");
                    float withDrawAmount = scan.nextFloat();
                    System.out.println(ATMMachine.withDrawing(withDrawAmount));
                    break;
                case 2:
                    System.out.println("Enter the Deposit amount");
                    float depositAmount = scan.nextFloat();
                    System.out.println(ATMMachine.Deposit(depositAmount));
                    break;
                case 3:
                    System.out.println("Your Account Balance is : "+ATMMachine.checkBalance());
                    break;
                case 4:
                    System.out.println("Thankyou for using our ATM");
                    isExit = true;
                    break;
                default : 
                    System.out.println("Invalid number");
                    break;
            }
    }
        scan.close();
    }
}

class UserBankAccount{
   protected static float accountBalance = 1000;
}

