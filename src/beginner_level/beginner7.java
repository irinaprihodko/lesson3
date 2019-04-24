package beginner_level;

public class beginner7 {

    // Given an array of integers. Find and print the max element in it

    public static void main(String[] args) {
        int[] array = {45, 3, -78, 48, 1};
        System.out.println(maximal(array));
    }

    private static int maximal(int[] array) {
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (result < array[i])
                result = array[i];}
            return result;
        }

    }








