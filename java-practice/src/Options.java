import java.util.Scanner;

public class Options {
//    Note: Goal is to prompt the user with a series of questions and depending on the answer will provide a different option

    public static void main(String[] args) {
        System.out.println("Would you like to begin?\n Type \"yes\"\n Type \"no\"\n Type \"add\" to add two numbers\n Type \"subtract\" to get the difference");
        Scanner optionsScanner = new Scanner(System.in);
        String userInput = optionsScanner.nextLine();

        Scanner optionsScanner2 = new Scanner(System.in);
        double userInput2 = optionsScanner2.nextDouble();

        Scanner optionsScanner3 = new Scanner(System.in);
        double userInput3 = optionsScanner3.nextDouble();



        System.out.println(userInput);

        if (userInput.equals("yes")){
             Calculator.inputTest();
        }
        else if (userInput.equals("add")){
            System.out.println(Calculator.addNumbers(userInput2,userInput3));
        }
        else if (userInput.equals("subtract")){
            System.out.println(Calculator.substractNumbers(userInput2, userInput3));
        }
        else if (userInput.equals("no")){
            System.out.println("Goodbye!");
        }

    }
}