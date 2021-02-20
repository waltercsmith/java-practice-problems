import java.util.Scanner;

public class Options {
//    Note: Goal is to prompt the user with a series of questions and depending on the answer will provide a different option

    public static void main(String[] args) {
        System.out.println("Would you like to begin?\n Type \"1\" for yes\n Type \"2\" for no");
        Scanner optionsScanner = new Scanner(System.in);
        String userInput = optionsScanner.nextLine();


        System.out.println(userInput);

        if (userInput.equals("1")){
             Calculator.inputTest();
        }
        else {
            System.out.println("Goodbye!");
        }

    }
}
