package java_2_review;

public class Inheritance extends OopMain{

//    CLASSES can inherit another class by using the keyword EXTENDS (in lowercase)

//    SUBCLASSES are classes that inherit from another classes which would be called SUPERCLASSES

//    A subclass inherits all the fields of it's superclass, and can re-use any of it's functionality.

//    SUBCLASSES can also add new fields

//    ---⭐︎⭐ INHERITANCE IS ONE DIMENSIONAL ⭐︎⭐︎---

/*  SUBCLASSES:

        can override methods on the superclass by:

            defining a method with the same name, return type, and parameters as in the superclass


            */



    public Inheritance(String nameInheritancePerson){
        super(nameInheritancePerson);
    }

    public Inheritance() {
    }


//    ⤵ ⤵ ⤵ ⤵ ⤵ ⤵ ⤵  Overrides a method from the superclass called OopMain

    public void sayAye(){
        System.out.println("Aye! What's good?!, a greeting from the class called Inheritance!");
    }



/*    Fields that are PROTECTED not visible outside of the class, but is visible to classes that extend the class that the field is defined in */




        public static void main(String[] args) {

//    Created new instance of the Inheritance subclass

        Inheritance childOne = new Inheritance("Winston");
        childOne.sayHello();

        System.out.println(childOne.sayHello());

            System.out.println();;

            Inheritance person = new Inheritance();

            OopMain ayeFromOopMain = new OopMain();

            Inheritance ayeFromInheritance = new Inheritance("Wallace");

            ayeFromOopMain.sayAye();

            ayeFromOopMain.sayAye();

            person.sayAye(); /* <--- Needed to create a constructor within the Inheritance subclasses
            above two objects where printing the same string which was not the goal
            */







    }

}
