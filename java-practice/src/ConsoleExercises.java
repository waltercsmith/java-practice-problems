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

//        System.out.println("Enter 3 words");
//        Scanner sc = new Scanner(System.in);
//        String userInput = sc.next();
//        String user2ndInput = sc.next();
//        String user3rdInput = sc.next();
//
//        System.out.println(userInput + "\n" + user2ndInput + "\n" + user3rdInput);

//        Entering additional words will not be displayed to the console


//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

//        System.out.println("Please enter a sentence");
//        Scanner scannerSentence = new Scanner(System.in);
//        String userSentence = scannerSentence.next();
//        System.out.println(userSentence);

//        All the words are not captured in the above code to display on the console, only the first word Telekinesis


//        System.out.println("Please enter a sentence");
//        Scanner scannerSentence2 = new Scanner(System.in);
//        String userSentence2 = scannerSentence2.nextLine();
//        System.out.println(userSentence2);

//        The above code allows the user to input a sentence (which has spaces between words) and display on the console


//        Display the area and perimeter of a classroom that is a rectangle
//        The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width
//        int length = 10;
//        int width = 5;
//
//        System.out.println((2 * length) + (2 * width));
//
//        int anotherLength = 10;
//        int anotherWidth = 5;
//
//        double perimeterCalc = (2 * anotherLength) + (2 * anotherWidth);

        System.out.println("Enter two numbers");
        Scanner scanner2Numbers = new Scanner(System.in);
        double userNumber = scanner2Numbers.nextDouble();
        double userNumber2 = scanner2Numbers.nextDouble();

        double add2UserNumbers = ((userNumber + userNumber2) * 2);
        System.out.println("The first number is: " + userNumber);
        System.out.println("The second number is: " + userNumber2);
        System.out.println("The result of adding " + userNumber + userNumber2 + "then multiplying by 2 is ");
        System.out.println("| | |");
        System.out.println("v v v");
        System.out.println(add2UserNumbers);








    }
}
