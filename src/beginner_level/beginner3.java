package beginner_level;

public class beginner3 {
    /*
    Create a method (program) which returns True
    if the given non-negative number
    is a multiple of 3 or a multiple of 5
    */
    static boolean check (int x){

        return (x%3==0 && x>=0) || (x%5==0 && x>=0);

    }
    public static void main(String[] args) {
        System.out.println(check(26));
    }

}
