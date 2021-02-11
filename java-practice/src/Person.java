public class Person {

    //Created private String property called name
    private String name;


    //This is a constructor that accepts a string value & sets the person's name to the passed string
    public Person(String aPersonsName){
         this.name = aPersonsName;
    }

    //Needs to return the person's name
    public String getName(){
        return this.name = name;
    }

    //Needs to change the name property to the passed value
    public void setName(String name){

    }


    //Needs to print to the console using the person's name
    public void sayHello(){
//        return String.format("%s says Hey!", this.name);
        System.out.println(this.name + " says Hey!");
    }
    /*^^^^^ Attempted to use return String.format() with this.name but was prompted with a problem
    stating that cannot return a value from a method with void result type*/

    public static void main(String[] args) {
        Person walt = new Person("Walt");
        walt.sayHello();


    }

}
