package Beginner;

public class Task4 {
    private String description = "Given an array of integers. Create a method (program) which takes two arguments -this array and number that you are looking for -and returns quantity of this number in the array";

    public void showTask() {
        System.out.println(description);
    }

    public static int findAmountOfNumber(int[] array, int n) {
        int result = 0;
        for (int v : array) {
            if (v == n) {
                result++;
            }

        }
return result;
    }
}