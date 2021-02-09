import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

//        Exercise 2 of Strings Module

        /*Java code that uses the input into the command line to have a conversation with Bob.
        * If the user inputs a question, exclamation, nothing or anything else will be presented
        * by a varied response*/
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        System.out.println("You: " + userInput);
        if (userInput.endsWith("?")){
            System.out.println("Bob: " + "Sure.");
        }else if (userInput.endsWith("!")){
            System.out.println("Bob: " + "Whoa, chill out!");
        }else if (userInput.endsWith(" ")){
            System.out.println("Bob: " + "Fine. Be that way!");
        }else {
            System.out.println("Bob: Whatever.");
        }
    }
}
