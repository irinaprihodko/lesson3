package preintermediate_level;
/*Given an array of integers.
Write a method which calculates sum of all elements
 and arithmetic average of them*/
public class pre6 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        int sum = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            average = sum / array.length;
        }
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
    }
}

