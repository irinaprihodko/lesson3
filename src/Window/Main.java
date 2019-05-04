package Window;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<TaskInfo> tasks = new ArrayList<TaskInfo>();

        tasks.add(new TaskInfo(1,
                "CONDITIONS: \n Given an array of integer numbers." +
                        "\n Create a method(program) which returns \n a new one where each element" +
                        " \n is multiplied by 3",
                "SOLUTION: \n public static void showArray(int[]array, int n){" +
                        "\n\t for (int i = 1; i < array.length; i++) " +
                        "\n\t array[i] = array[i] * n;" +
                        " \n  System.out.println(Arrays.toString(array)"));
        tasks.add(new TaskInfo(2,
                "CONDITIONS: \n Given two integers, x and y.\nCreate a method (program) \n which returns True \nif one if them is 10 \n or if their sum is 10",
                "SOLUTION: \n public static boolean checkDigitsAndSum(int x, int y){\nint sum = x + y;\nreturn sum ==10 || x==10 ||y==10;}"));
        tasks.add(new TaskInfo(3,
                "CONDITIONS: \nCreate a method (program)\n which returns True \nif the given non-negative number\n is a multiple of 3 \n or a multiple of 5",
                "SOLUTION: \nstatic boolean checkMultiple (int x)\n{return (x%3==0 && x>=0) || (x%5==0 && x>=0);}"));
        tasks.add(new TaskInfo(4,
                "CONDITIONS: \nGiven an array of integers. \nCreate a method (program) \nwhich takes two arguments -\nthis array and number that you are looking for -\nand returns quantity of this number in the array",
                "SOLUTION: \n public static int findAmountOfNumber(int[] array, int n) {\n" +
                        "        int result = 0;\n" +
                        "        for (int v : array) {\n" +
                        "            if (v == n) {\n" +
                        "                result++;}}\n" +
                        "    return result;"));


        TaskShow app = new TaskShow(tasks);
        app.setVisible(true);
        app.pack();
    }
}
