package beginner_level;

public class beginner5 {
    /*
    There are several marks in the school: from 1 to 5 (the highest).
    Create a method (program) which takes a mark and return your result
    (for ex. "Excellent", "Good", "Failed" etc.). Please do not use if...else condition
    */

    public static void main(String[] args) {
        int mark = 1 ;
        switch (mark){
            case 1:
                System.out.println("Ooops");
                break;
            case 2:
                System.out.println("Failed");
                break;
            case 3:
                System.out.println("Bad");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Mark " + mark + " is not in use.");
        }
    }

    }
