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

    public static boolean yesNo(boolean trueOrFalse){
        if (trueOrFalse){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        return trueOrFalse;
    }


    public static void main(String[] args){

        System.out.println("Type some words");
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        Input input1 = new Input(userInput);
        System.out.println(input1.getString());






    }
}
