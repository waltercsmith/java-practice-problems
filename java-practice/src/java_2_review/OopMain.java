package java_2_review;

public class OopMain {
//    ^^ This a PUBLIC (everyone can access it) CLASS (blueprint/template for objects)

     public String studentName; //  <-- this is a FIELD and a VARIABLE (property)

//    * A FIELD tends to be protected or private in scope

//    * A PROPERTY tends be public in scope


    public String printName(String x){return x; } // <-- this is also a FIELD but it's a METHOD (function)

//    A field is belongs to an object by default but can be DEFINED as belong to a class with the STATIC keyword

//     Fields are access with the . operator

//    An OBJECT is an INSTANCE of a CLASS


//    --------------------      -------------------------------


//    ---- ⭐︎⭐︎ STATIC FIELDS/METHODS can be accessed without creating a new instance of a class first ⭐︎⭐︎ ----



    public String sayHello(){ return String.format("Welcome %s", studentName); }

//    ^^ A public method that takes no arguments but returns string statement w/ a STRING property (studentName)



    public static int waltsAge = 30; // <-- this is static property


//    --- CONSTRUCTORS ---

/*   A CONSTRUCTOR is a special method that is called when a class is created
        HAS:
            SAME NAME as the class
            DOES NOT DEFINE A RETURN TYPE

            BUT

            CAN ACCEPT ARGUMENTS & BE OVERLOADED

 */

    public OopMain(){
        System.out.println("I am a CONSTRUCTOR of the OopMain Class\n Whenever a class is created...\n So AM I!!!");

    }


    public static void main(String[] args) {


        OopMain walt = new OopMain(); // <-- new instance of the OopMain class

        System.out.println();

        walt.studentName = "Walt";

        System.out.println(walt.sayHello()); // <-- using a new instance of the OopMain class to access a property to print a string


        System.out.println();

        System.out.println(OopMain.waltsAge); // <--- referencing the OopMain class to access the static property of waltsAge

        System.out.println();

    OopMain instanceOne = new OopMain();

        System.out.println();

    OopMain instanceTwo = new OopMain();

    }

}
