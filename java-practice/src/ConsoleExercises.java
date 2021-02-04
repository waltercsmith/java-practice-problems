import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args){

//        Copy this code into your main method:
    double pi = 3.14159;
//        Write some Java code that uses the variable pi to output the following:
//        The value of pi is approximately 3.14.



//        System.out.format("The value of pi is approximately %.2f \n", pi);

//        Didn't change the value of the variable; instead, used System.out.format to accomplish this


//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method

//        System.out.println("Please enter an integer:");
//        Scanner scanner = new Scanner(System.in);
//        int userInputInteger = scanner.nextInt();
//        System.out.println("The user entered: " + userInputInteger);

//        If the input is not an Integer the console displays an Exception in thread "main" message

//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline

        System.out.println("Enter 3 words");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        String user2ndInput = sc.next();
        String user3rdInput = sc.next();

        System.out.println(userInput + "\n" + user2ndInput + "\n" + user3rdInput);


    }
}
