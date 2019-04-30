package preintermediate_level;
/*Given 2 integers, a and b.
 Write a method which returns true
 if one of them is 21 or if their sum is 21.*/
public class pre3 {
    static boolean result(int a, int b){
        int sum = a + b;
        return sum ==21 || a==21 ||b==21;
    }
    public static void main(String[] args) {
        System.out.println(result(19,2));
    }



}
