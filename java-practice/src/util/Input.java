package util;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Input {

//    private scanner; //Was told by the exercise to create a new property of scanner but prompted with problems:

    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.nextLine();



    public String getString(){
        return this.userInput;
    }

    public void printGetString(){
        System.out.println(getString());
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();



    }
}
