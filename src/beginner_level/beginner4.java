package beginner_level;

public class beginner4 {
    /*  Given an array of integers. Create a method (program) which takes two arguments -
         this array and number that you are looking for -
         and returns quantity of this number in the array
     */
    public static void main(String[] args) {
        int[] array1 = new int[] {-13, 45, 78, 45, 45};
        System.out.println(findAmountOfNumber( array1, 45 ));
    }
    public static int findAmountOfNumber(int[]array,int n){
    int result = 0;

/* первый способ
            for (int i = 0; i <array.length ; i++) {
            if (array[i] == n)
         result++;
        второй способ

 */
        for (int v: array) {
            if (v == n){
                result++;
                System.out.println(result);
            }
        }
        return result;
    }






}