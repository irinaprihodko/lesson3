package Beginner;

import java.util.Arrays;

public class Task1 {
    private String description = "Given an array of integer numbers.Create a method(program) which returns a new one where each element is multiplied by 3";

    public void showTask(){ System.out.println(description);}
    public static void showArray(int[]array, int n){
        for (int i = 1; i < array.length; i++)
            array[i] = array[i] * n;
            System.out.println(Arrays.toString(array));
    }


}
