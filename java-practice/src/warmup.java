
public class warmup {
    /*The parameter weekday is true if it is a weekday,
        and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on                    vacation. Return true if we sleep in.*/
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(weekday && vacation){
            return true;
        } if(weekday){
            return false;
        }
        return true;
    }

        /*We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in    trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.*/
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        if(aSmile == bSmile){
            return true;
        }
        return false;
    }


	public static void main(String[] args){
        System.out.println(sleepIn(true,false));
        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));

    }

}
