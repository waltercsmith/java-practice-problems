package java_2_review.Exceptions;

import java.lang.Exception;

public class Exceptions {

    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        System.out.println(numbers[0] + "\n");

        try {
            int[] digits = new int[4];
            digits[0] = 720;
            digits[1] = 1080;
            digits[2] = 1990;
            digits[3] = 308;
            System.out.println(digits[4]);
        }catch (Exception e) {
            System.out.println("Oops, try again chief!");
        }


    }
}
