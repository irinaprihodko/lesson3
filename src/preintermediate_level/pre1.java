package preintermediate_level;
/*
        A couple is going to go to the cinema.
        There are two booleanparameters heSmileand sheSmile
        Write a method which returns True
        if they're eventually going to go to the cinema, of False otherwise:
        visitCinema(true, true) → true
        visitCinema(false, false) → truevisitCinema(true, false) → false
*/

public class pre1 {

    public static void main(String[] args) {
        System.out.println(visitCinema(false,false));
    }
    public static  boolean visitCinema(boolean heSmile, boolean sheSmile){
        return heSmile == sheSmile;
    }
}
