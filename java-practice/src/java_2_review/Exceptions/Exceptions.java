package java_2_review.Exceptions;

import java.lang.Exception;

public class Exceptions {

//    Using a throw statement to create a custom error regarding age of a person allowed into a club
    static void clubEligible(int age) {

        if (age < 19) {
            throw new ArithmeticException("Club access has been reject, you are not over 19 years of age");
        }
        else {
            System.out.println("Club access is granted, Welcome!");
        }
    }


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

        System.out.println();
        clubEligible(18);

    }
}
