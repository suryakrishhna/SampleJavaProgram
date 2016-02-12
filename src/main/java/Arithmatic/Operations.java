package Arithmatic;
import java.util.Scanner;
import Arithmatic.Addition;
import Arithmatic.Subtraction;
import Arithmatic.Multiplication;
import Arithmatic.Division;

/**
 * Created by surya on 2/11/2016.
 */
import java.util.Scanner;

public class Operations {
    public static void main(String args[]){
        double a,b,add, multi, div, sub;
        Scanner num = new Scanner(System.in);
        //Scanner b = new Scanner(System.in);
        System.out.println("Enter first number:");
        a = num.nextDouble();
        System.out.println("Enter second number:");
        b = num.nextDouble();
        System.out.println("Enter operation: 1 for Addition. 2 for Subtraction. 3 for Multiplication 4 for Division");
        double op = num.nextDouble();
        if(op == 1){
            System.out.println("Addition of two numbers is " + Addition.add(a,b));
        }
        else if(op == 2){
            System.out.println("Subtraction of two numbers is " + Subtraction.sub(a,b));
        }
        else if(op == 3){
            System.out.println("Multiplication of two numbers is " + Multiplication.multi(a,b));
        }
        else if(op == 4){
            System.out.println("Division of two numbers is " + Division.div(a,b));
        }
        else{
            System.out.println("Invalid entry. Try Again");
        }
    }

    //public static double add(double x, double y){
      //  return x+y;
    //}
    //public static double sub(double x, double y){
      //  return x-y;
    //}
    //public static double multi(double x, double y){
        //return x*y;
    //}
    //public static double div(double x, double y){
      //  return x/y;
    //}
}
