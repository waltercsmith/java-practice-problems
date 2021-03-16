package java_2_review.Abstract.Interface;

import java_2_review.Abstract.Bug;

public interface WritesCode {

    /*
    An interface is a special case of an abstract class. An interface is an abstract class that follows these rules:

                all methods are public and abstract.
                all properties are public static and final.
                no static methods.
     */


    Bug[]  writesCode(int numberOfLines);

    boolean debug(Bug bug);

    void drinkCoffee();



}
