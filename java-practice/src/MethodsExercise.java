import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodsExercise {


//    Exercise 1
//    Create 5 separate methods: Addition, Subtraction, Multiplication, Division, Modulus

//    Each function needs to take two parameters/arguments so that the operation can be performed

//    Test your methods and verify the output.



    public static double add(double a, double b){
        return a + b;
    }

    public static double subtract(double a, double b){
        return a - b;
    }

    public static double multiply(double a, double b){
        return a * b;
    }

    public static double divide(double a, double b){
        return a / b;
    }

    public static double modulus(double a , double b){
        return a % b;
    }




    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        if (userInput >= min | userInput >= max ){
            System.out.println("Great you're within limits");
        }else {
            System.out.println("Try again!");
        }
        return userInput;
    }

    public static void main(String[] args) {

//        System.out.println(add(45.4, 34));
//
//        System.out.println(subtract(3.4, 9));
//
//        System.out.println(multiply(33.2, 47));
//
//        System.out.println(divide(99.4, 0.45));
//
//        System.out.println(modulus(123, 9));


//        Exercise 2
        System.out.println("Enter a number between 1 and 10");

        getInteger(1,10);
//        System.out.println("Enter a number between 1 and 10");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

    }
}
