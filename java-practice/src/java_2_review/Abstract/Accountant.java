package java_2_review.Abstract;

public class Accountant extends Worker {
    public String work(){
        return "Crunching numbers";
    }

//    An abstract class is used to represent something that needs to be extended

    public static void main(String[] args) {

        Worker wally = new Accountant();
    }
}
