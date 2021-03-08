package java_2_review;

public class OopMain {
//    ^^ This a PUBLIC (everyone can access it) CLASS (blueprint/template for objects)

     public String studentName; //  <-- this is a FIELD and a VARIABLE (property)


    public String printName(String x){return x; } // <-- this is also a FIELD but it's a METHOD (function)

//    A field is belongs to an object by default but can be DEFINED as belong to a class with the STATIC keyword

//     Fields are access with the . operator

//    An OBJECT is an INSTANCE of a CLASS


//    --------------------      -------------------------------

    public String sayHello(){ return String.format("Welcome %s", studentName); }

//    ^^ A public method that takes no arguments but returns string statement w/ a STRING property (studentName)





    public static void main(String[] args) {


        OopMain walt = new OopMain(); // <-- new instance of the OopMain class

        walt.studentName = "Walt";


    }

}
