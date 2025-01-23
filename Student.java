import java.util.*;
import java.lang.System;

public class Student{ 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float tamil,english,maths,chemistry,physics,computer_science = 0;
        float totalMarks = 0;
        float average = 0;
        char grade;
        //getting Input from student
        System.out.println("Enter the Marks out of 100 for the subjects");
        System.out.print("Tamil : ");
        tamil = (float)scan.nextInt();
        System.out.print("English : ");
        english = (float)scan.nextInt();
        System.out.print("Maths : ");
        maths = (float)scan.nextInt();
        System.out.print("chemistry : ");
        chemistry = (float)scan.nextInt();
        System.out.print("physics : ");
        physics = (float)scan.nextInt();
        System.out.print("computer_science : ");
        computer_science = (float)scan.nextInt();
        //returning the total Marks
        totalMarks = tamil+english+maths+chemistry+physics+computer_science;
        //Finding the average 
        average = totalMarks/6;
        if(average>=90){
            grade = 'A';
        }
        else if(average>=80 && average<90){
            grade = 'B';
        }
        else if(average>=70 && average<80){
            grade = 'C';
        }
        else if(average>=60 && average<70){
            grade = 'D';
        }
        else{
            grade = 'f';
        }
        //closing the scanner
        scan.close();
        //printing the marks,average & grade
        System.out.println("Total Marks is : "+totalMarks);
        System.out.println("Average Marks is : "+average);
        System.out.println("Grade is : "+grade);
       }
    }



