package beginner_level;

import java.util.Arrays;

public class beginner1 {
    /*Given an array of integer numbers.
      Create a method(program) which returns a new one
      where each element is multiplied by 3
    */

    public static void main(String[] args) {
        multiply();
    }
        public static void multiply(){
            int[] array = {1, 97, 7, 90};
            for (int i = 1; i < array.length; i++) {
                array[i] = array[i] * 3;
            }
            System.out.println(Arrays.toString(array));
        }


    }
