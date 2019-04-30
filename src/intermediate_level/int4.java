public class int4 {
    public static void main(String[] args) {
        System.out.println(countDigits("cghfk3jjv6f35kok"));
        }

    public static int countDigits (String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                sum+= Integer.parseInt(String.valueOf(str.charAt(i)));
                System.out.println(str.charAt(i));
            }
        }
        return sum;
    }
}
