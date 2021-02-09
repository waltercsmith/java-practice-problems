public class Methods {
//    public static void changeString(String s) {
//        s = "Wub a lub a dub dub";
//    }
//    public static void count(int n){
//        if (n <= 0){
//            System.out.println("All done!");
//            return;
//        }
//        System.out.println(n);
//        count(n - 1);
//    }
    public static long getPower(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
}

    public static void main(String[] args) {
//        String changeMe = "hello codeup!";
//        changeString(changeMe);
//        System.out.println(changeMe);


//        count(5);

        System.out.println(getPower(5, 3));

    }
}
