package Beginner;

public class Task2 {
    private String description = "Given two integers, x and y.Create a method (program) which returns True if one if them is 10 or if their sum is 10";

    public void showTask(){ System.out.println(description);}
    public static boolean checkDigitsAndSum(int x, int y){
            int sum = x + y;
            return sum ==10 || x==10 ||y==10;
    }

}
