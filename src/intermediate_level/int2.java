public class int2 {
   public static void main (String[]args){
       System.out.println(countLuckyTickets(1, 999999));
   }
   public static  int countLuckyTickets(int a, int b){
       int sum = 0;

       for (int i = a; i <= b; i++) {
            if ( isLucky(i))
                sum++;
       }
       return sum;

   }
    public static boolean isLucky (int x){
       int leftSum = 0;
       int rightSum = 0;
        for (int i = 1; i <= 3 ; i++) {
            rightSum += x % 10;
            x /= 10;
        }
        for (int i = 0; i < 3 ; i++) {
            leftSum  += x%10;
            x /= 10;
        }
        return leftSum == rightSum;
    }
}
