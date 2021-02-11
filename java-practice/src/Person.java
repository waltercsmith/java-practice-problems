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
    public void setName(String newName){
        this.name = newName;
    }


    //Needs to print to the console using the person's name
    public void sayHello(){
//        return String.format("%s says Hey!", this.name);
        System.out.println(this.name + " says Hey!");
    }
    /*^^^^^ Attempted to use return String.format() with this.name but was prompted with a problem
    stating that cannot return a value from a method with void result type*/

    public static void main(String[] args) {
//        Person walt = new Person("Walt");
//        walt.sayHello();

        //Beginning of Comparison Code is within these two comment lines
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
        //End of Comparison Code
    }

}
