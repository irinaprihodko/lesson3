package preintermediate_level;
import java.util.Scanner;

/*Write a method which prints multiplication table for the input number. Like this:
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
...*/
public class pre9 {


    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите число:");
            mult(scan.nextInt());
        }

        public  static void mult(int a) {
            for (int b = 1; b <= 10; b++) {
                int result = a * b;
                System.out.println(a + " * " + b + " = " + result);
            }
        }
    }

