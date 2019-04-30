package preintermediate_level;
/*Write a method for calculating quadratic equation.
It takes a, b, c numbers and print the solution*/

public class pre14 {
    public static void main(String[] args) {

        solution(2, 4, 2);
    }

    public static void solution(double a, double b, double c) {
        System.out.println("Equation:" + a + "*x^2 + "+ b + "*x" + c + " =0" );
        double x = 0;
        double D  = b*b - 4*a*c;
        if(D < 0)
            System.out.println("Equation has no solution");
        else {
            double x1 = (-b + Math.sqrt(D))/2*a;
            double x2 = (-b - Math.sqrt(D))/2*a;
            System.out.println("x1 = " + x1 + "\nx2 = "+ x2);
        }



    }

}