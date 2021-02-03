public class ClassName {
    public static void main(String [] args) {
        System.out.println("Hello, Walter! Stay Sharp!");

        System.out.println("Walter is awesome!");

        int myFavoriteNumber; //declared int variable
        myFavoriteNumber = 308; // initialized in variable
        System.out.print(myFavoriteNumber + "\n");

//        Create a String variable named myString and assign a string value to it, then print the variable out to the       console.

        String myString = "Walter";
        System.out.print(myString + "\n");

//        Change your code to assign a character value to myString. What do you notice?
//        String myString = 'W';
//        Console states cannot find symbol

//        Change your code to assign the value 3.14159 to myString. What happens?
//        String myString = 3.14159;
//        Console states cannot find symbol
//        Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        long myNumber;
//        System.out.println(myNumber);
//        console states that myNumber might not have initialized

//        Change your code to assign the value 3.14 to myNumber. What do you notice?
//        myNumber = 3.14;
//        console states possible lossy conversion from double to long

//        Change your code to assign the value 123L (Note the 'L' at the end) to myNumber
//        myNumber = 123L;
//        System.out.println(myNumber);

//        Change your code to assign the value 123 to myNumber
//        myNumber = 123;
//        System.out.println(myNumber);

//        Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

//        long type does not hold a floating point but assigning an integer is just casting from a low precision to a high precision

//        Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

//        IntelliJ states that float is required but a double is provided
//        float myNumber = 3.14;

//        double myNumber = 3.14; one way to fix it is change the primitive type

//        float myNumber = 3.14F; another way to fix it is to add a F after the last digit

//        Rewrite the following expressions using the relevant shorthand assignment operators
        int x = 4;
        x = x + 5;
        x += 5; //shorthand assignment

        int a = 3;
        int b = 4;
        b = b * a;
        b *= a; //shorthand assignment

        int c = 10;
        int d = 2;
        c = c / d;
        c /= d; //shorthand assignment
        d -= c; //shorthand assignment

//        Assign a value to a numerical variable that is larger (or smaller) than the type can hold?
//        double bigNumber = 1.7E308;
//        float smallerThanBigNumber = bigNumber;

//        Can not assign a value to a numerical variable that is larger than the type can hold

        float smallerNumber = 3.4E30f;
        double bigNumber = smallerNumber;
        int andAnotherNumber = 30;

//        Can assign a value to a numerical variable that is smaller than the type can hold

    }
}
