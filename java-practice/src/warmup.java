
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


	public static void main(String[] args){
        System.out.println(sleepIn(true,false));


	}

}
