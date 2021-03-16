package java_2_review.Abstract;

public class Accountant extends Worker {
    public String work(){
        return "Crunching numbers";
    }

    public static void main(String[] args) {

        Worker wally = new Accountant();
    }
}
