import java.util.Scanner;

public class Calculator {


    static void input(){
        System.out.println("Type something");
        Scanner sc2 = new Scanner(System.in);
        String userInput2 = sc2.nextLine();
    }

    static  void  sayHello(){
        System.out.println("Hey, how are you?");
    }

    public static void main(String[] args) {

        System.out.println("Type something");

        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        System.out.println(userInput);
        if (userInput.equals("quit")){
            System.out.println("Ending prompt");
        }
        else {
            input();
//            System.out.println("Type something");
//            Scanner sc1 = new Scanner(System.in);
//            String userInput1 = sc.nextLine();
//            System.out.println(userInput1);
        }


//        System.out.println(userInput);
//        if (userInput.equals("quit")){
//            System.out.println("Ending prompt");
//        }

    }
}
