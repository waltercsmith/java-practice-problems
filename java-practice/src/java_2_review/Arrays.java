package java_2_review;
//import java.util.Arrays;

public class Arrays {

//    Arrays are a special kind of object that contain zero or more items called elements

   static double[] prices; // variable named prices, type is an array which each element is a double

//Arrays have a fixed length when created an is accessed through: .length

    static double[] list;

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

        System.out.println("The total number of elements in this array will change each time it's ran: " + myCode.length);

    }

}
