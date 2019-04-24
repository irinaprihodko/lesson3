package beginner_level;
/*
Create method which gets a number form 1 to 9 (for example 4) and then prints the follow output:
For number 4:
*
**
***
****
***
**
*
*/

import java.util.Scanner;

public class beginner10 {
    public static void main(String[] args) {

        printPyramid();
    }

    public static void printPyramid() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число от 1 до 9");
        int rangeOfPyramid = sc.nextInt();


        for (int i = 0; i < rangeOfPyramid; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = rangeOfPyramid-2; i >= 0 ; i--) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}


