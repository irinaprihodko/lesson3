package preintermediate_level;
/*Write a method which calculates a sum of first 100 odd elements of Fibonacci sequence*/
public class pre8 {


    public static void main(String[] args){
        int n0 = 1;
        int n1 = 1;
        int n2;
        int sum = 2;
        System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= 10; i++){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
            if (n2%2 == 1) {
                sum += n2;
                           }
        }
        System.out.println("\nSum = "+ sum);

    }
}