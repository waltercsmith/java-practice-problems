package main;

import java.util.Scanner;

public class Calculator {

    static double addNumbers(double num1, double num2){
        return num1 + num2;
    }

    static double multiply2Numbers(double num1, double num2){
        return num1 * num2;
    }

    static double squareANumber(double num1){
        return num1 * num1;
    }

    static double cubeNumber(double num1){
        return num1 * num1 * num1;
    }

    static double modulus2Numbers(double num1, double num2){
        return num1 % num2;
    }

    static double divide2Numbers(double num1, double num2){
        return num1 / num2;
    }

    static double substractNumbers(double num1, double num2){
        return num1 + num2;
    }

    static double absoluteValue(double num){return Math.abs(num);}

    static double random1To100(){
        return (int) (Math.random() * 101);
    }



    static void inputTest() {
//        System.out.println("Type something");
        Scanner sc2 = new Scanner(System.in);
        String userInput2 = sc2.nextLine();
        if (userInput2.equals("quit")) {
            System.out.println("Ending prompt");
        } else {
            System.out.println(userInput2);
            inputTest();

        }
    }

        static void sayHello () {
            System.out.println("Hey, how are you?");
        }

        public static void main (String[]args){

        boolean isJavaFun = true;
        boolean isBroccoliAndCheeseGood = false;

            System.out.println(isJavaFun);

            System.out.println("Type something");

            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();

            inputTest();

//            System.out.println(modulus2Numbers(10,5));


//        System.out.println(userInput);
//        if (userInput.equals("quit")){
//            System.out.println("Ending prompt");
//        }
//        else {
//            input();
////            System.out.println("Type something");
////            Scanner sc1 = new Scanner(System.in);
////            String userInput1 = sc.nextLine();
////            System.out.println(userInput1);
//        }


//        System.out.println(userInput);
//        if (userInput.equals("quit")){
//            System.out.println("Ending prompt");
//        }

        }

    }

