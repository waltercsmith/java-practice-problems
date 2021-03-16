package java_2_review.Abstract;

abstract class Worker {

    public abstract String work();

    public static void main(String[] args) {
//        Worker kai = new Worker();    <--- Worker is abstract; cannot be instantiated

        Worker jay = new Accountant();

    }

}
