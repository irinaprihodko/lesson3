package beginner_level;

public class beginner2 {
    /*Given two integers, x and y.
     Create a method (program) which returns True if one if them is 10 or if their sum is 10
     */
    static boolean result(int x, int y){
        int sum = x + y;
        return sum ==10 || x==10 ||y==10;
    }
    public static void main(String[] args) {
        System.out.println(result(100,1));
    }

}




