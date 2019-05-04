package Beginner;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] initialData = {1,2,3,4,6,7,5,4,3,5,6,7,8,0};
        Task1 myTask = new Task1();
        myTask.showTask();
        System.out.println("Initial array");
        myTask.showArray(initialData,1);
        System.out.println("Array multiplied by 3");
        myTask.showArray(initialData,3);
        System.out.println(" ");

        Task2 myTask2 = new Task2();
        myTask2.showTask();
        System.out.println(myTask2.checkDigitsAndSum(0,10));
        System.out.println(" ");

        Task3 myTask3 = new Task3();
        myTask3.showTask();
        System.out.println(myTask3.checkMultiple(7));
        System.out.println(" ");

        Task4 myTask4 = new Task4();
        myTask4.showTask();
        int [] array = {1,2,7,4,6,7};
        System.out.println(Arrays.toString(array));
        System.out.println(myTask4.findAmountOfNumber(array, 7));
        System.out.println(" ");
    }







}
