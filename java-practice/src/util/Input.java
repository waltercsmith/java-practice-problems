package util;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Input {

//    private scanner; //Was told by the exercise to create a new property of scanner but prompted with problems:


     private String someWords; //private field

    public Input(String words){ //my Input constructor
        this.someWords = words;
    }

    public String getString(){  //Method that gets the string of a user's input
        return someWords;
    }

    public static boolean yesNo(String x){
        if (x.equals("y")){
            return true;
        }
        return false;
    }

    public static int getInt(int min, int max){
        Scanner scannerInt = new Scanner(System.in);
        int userInputInt = scannerInt.nextInt();
        if (userInputInt >= min && userInputInt <= max){
            System.out.printf("Great, %s  is within range",userInputInt);;
        }else {
            System.out.println("Please enter a number with range");
        }
        return getInt(min,max);

    }

    public static void main(String[] args){

//        System.out.println("Type some words");
//        System.out.println("Type \"y\" to return the boolean \"true\" any other input will result in the boolean \"false\" ");
//        Scanner scanner = new Scanner(System.in);
//
//        String userInput = scanner.nextLine();
//        Input input1 = new Input(userInput);
//        System.out.println(input1.getString());



//        System.out.println(yesNo(userInput));
        System.out.println("Please enter between 1 and 5");
        Scanner scannerInt = new Scanner(System.in);
        int userInputInt = scannerInt.nextInt();
        System.out.println(getInt(1,5));




    }
}
