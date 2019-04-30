package preintermediate_level;

import java.util.Arrays;

/*Given an array of integers. Write a method which finds max and min elements in it
and multiplies them by 2*/
public class pre7 {
    public static void main(String[] args) {
        int[] array = {45, 3, -78, 48, 1};
        System.out.println("Max * 2  = "+ maximal(array)*2);
        System.out.println("Min * 2 = "+ minimal(array)*2);
    }

    private static int maximal(int[] array) {
        Arrays.sort(array);
        int result1 = array[array.length-1];
               // for (int i = 0; i < array.length; i++) {
            //if (result1 < array[i])
               // result1 = array[i];}
        return result1;
    }
    private static int minimal(int[] array) {
        Arrays.sort(array);
        int result2 = array[0];
       /* for (int j = 0; j < array.length; j++) {
            if (result2 > array[j])
                result2 = array[j];}*/
        return result2;
    }
}
