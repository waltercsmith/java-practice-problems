package main;

import java.util.Scanner;

public class ControlFlowExercises {
//    Created a class called ControlFlowExercises w/ a main method

    public static void main(String[] args) {
//        ***WHILE LOOP***
//        Create a while loop with a integer variable with a value of 5, loop runs runs as long as i is less than 15
//    int i = 5;
//
//    while (i < 16){
//        System.out.print(" " + i);
//        i++;
//    }


//        ***DO-WHILE LOOPS***
//    Create a do-while loop that will count by 2's starting with 0 and ending with 100
//        int j = 2;
//        int i = 0;
//        do{
//            System.out.println(i * 2);
//            i++;
//        }
//        while (i < 51);

//        Now create a do-while loop to count backwards by 5's from 100 to -10
//        int k = 20;
//        int l = 5;
//        do {
//            System.out.println(k * l);
//            k--;
//        }
//        while (k > -3);


//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.

//        int m = 0;
//        long n = 2;
////        double square = Math.pow(m,2); // Did not work, console output 1.0
//        do {
//            System.out.println(m);
//            m++;
//            n *= n;
//        } while (m < 256);

//        **Having trouble with using a do while loop to complete this particular task

//        Refactor the previos two exercises to use a FOR loop

//        for (int o = 20; o > -3; o--){
//            System.out.println(o * 5);
//        }

//        for (int p = 1; p < 128; p++){
//            System.out.println(p * 2);
//        }

//        Write a program that prints the numbers 1 to 100
//        int a = 1;
//        do {
//            System.out.println(a);
//            a++;
//        }while (a < 101);

//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”
//        For numbers which are multiples of both three and five: print “FizzBuzz”.
//        for (int b = 1; b < 101; b++){
//            if (b % 3 == 0){
//                System.out.println(b + ": " + "Fizz" );
//            }else if (b % 5 == 0){
//                System.out.println(b + ": " + "Buzz");
//            }
//            else {
//                System.out.println(b + ": " + "FizzBuzz");
//            }
//        }

//        ***Display a table of powers***
//        System.out.println("What number would you like to enter?");
//
//        Scanner sc = new Scanner(System.in);
//        int userInput = sc.nextInt();
//
//
//        System.out.println("Here's your table!");
//
//        System.out.println(" number " + " | " + " squared " + " | " + " cubed ");
//        System.out.println("  ----- " + " | " + "  ----- " + " | " + "  ----- \t");
//
//        int i = 1;
//        while (i < userInput + 1){
//            System.out.println("\t" + i + "\t" + " | " + "\t" +  i * i  +  "\t" + " | " + i * i * i);
//            i++;
            //This prints out the numbers 1 through the userInput


            /*The above code prompts the user to enter a integer. What ever the input is will be displayed in the console start from 1 to the input. Also the numbers displayed will be squared and cubed*/
//        }


//        ***Convert given number grades to letter grades***

        System.out.println("Enter a grade number from 0 to 100");
        Scanner sc2 = new Scanner(System.in);
        int userInput2 = sc2.nextInt();

        if (userInput2 >= 88 & userInput2 <= 100){
            System.out.println("A");
        }else if (userInput2 >= 80 & userInput2 <= 87) {
            System.out.println("B");
        }else if (userInput2 >= 67 & userInput2 <= 79) {
            System.out.println("C");
        }else if (userInput2 >= 60 & userInput2 <= 66) {
            System.out.println("D");
        }else  {
            System.out.println("F");
        }



//        System.out.print("Would you like to begin? [y/N]");
//
//        Scanner sc3 = new Scanner(System.in);
//        String userInput3 = sc3.next();
//        boolean confirmation = userInput3.equals("y");





        }



    }


