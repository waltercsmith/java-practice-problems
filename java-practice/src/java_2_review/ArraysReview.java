package java_2_review;
import java.util.Arrays;

public class ArraysReview {

//    Arrays are a special kind of object that contain zero or more items called elements

   static double[] prices; // variable named prices, type is an array which each element is a double

//Arrays have a fixed length when created an is accessed through: .length

    static double[] list;

    private static void equals(int[] numbers, String[] languages) {
    }

    public static void main(String[] args) {

//        prices = new double[4];  //  assigned a value to prices that is an array with 4 elements

        double[] listTwo = new double[4];

        double[] elements;
        elements = new double[9];

        System.out.println("The total number of elements in the array called listTwo: " + listTwo.length);

//        System.out.println("The total number of elements in the array called lists: " + list.length);

        System.out.println();

        System.out.println("The total number of elements in the array called listTwo: " + elements.length);

        int numberOfBugs = (int) Math.floor(Math.random() * 100);
        int[] myCode = new int[numberOfBugs];

//        System.out.println();

        System.out.println("The total number of elements in this array will change each time it's ran: " + myCode.length + "\n \n");

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(numbers[0] + "\n"); // 1
        System.out.println(numbers[1] + "\n \n"); // 2
        System.out.println(numbers[2] + "\n"); // 0 -- default value
//        System.out.println(numbers[3]); // ArrayIndexOutOfBoundsException !!!


        String[] languages = {"html", "css", "javascript", "java"};

        for (int i = 0; i < languages.length; i += 1) {
            System.out.println(languages[i]);
        }

        System.out.println();

        String[] languages2 = {"html", "css", "javascript", "java", "mySQL"
        };

        for (String language2 : languages2) {
            System.out.println(language2 + "\n");
        }

        System.out.println( Arrays.equals(languages2,languages));

        System.out.println();

        int[] numbers2 = Arrays.copyOf(numbers, 5);
        numbers2[3] = 30;
        numbers2[4] = 26;

        for (int numbers3 : numbers2){
            System.out.println(numbers3 + "\n");
        }


    }



}
