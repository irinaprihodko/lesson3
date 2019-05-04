package Beginner;

public class Task3 {
    private String description = "Create a method (program) which returns True if the given non-negative number is a multiple of 3 or a multiple of 5";
    public void showTask(){ System.out.println(description);}
    static boolean checkMultiple (int x){

        return (x%3==0 && x>=0) || (x%5==0 && x>=0);

    }
}


