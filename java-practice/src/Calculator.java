import java.util.Scanner;

public class Calculator {

    public static String input(String arg){
        if (arg.equals("quit")){
            System.out.println("Ending prompt");
        }
        return input(arg);
    }

    static  void  sayHello(){
        System.out.println("Hey, how are you?");
    }

    public static void main(String[] args) {

        System.out.println("Type something");

        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        input(userInput);
//        System.out.println(userInput);
//        if (userInput.equals("quit")){
//            System.out.println("Ending prompt");
//        }

    }
}
