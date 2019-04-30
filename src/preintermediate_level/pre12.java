package preintermediate_level;
import java.util.Scanner;
/*Imagine that you have a special skill which allows to calculate
 amount of digits in any integer positive number.
For example, if number is 12345, amount=15.
 Write a method which checks your superpower
 for any hard-coded number.*/
public class pre12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input any positive number:");
        int n = scan.nextInt();
        int sum = 0;
        sum(n, sum);
    }

    public static void sum(int n, int sum) {
           while (n != 0) {
            //Суммирование цифр числа
            sum += (n % 10);
            n /= 10;
        }
        System.out.println(sum + " ");


    }
}