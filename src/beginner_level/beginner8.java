package beginner_level;
/*Given a string and an int n.
Return a string made of the first n characters of the string,
 followed by the first n-1 characters of the string, and so on.
 Example:yourMethod("Testing", 4) → "TestTesTeT"*/

public class beginner8 {
    public static void main(String[] args) {
        String s = "Testing";
        System.out.println(beginner8(s,4));
    }
    public static String beginner8(String str, int n){
        StringBuilder sb = new StringBuilder();
        int x = n;
        for (int i = 0; i < n; i++) {
            sb.append(str.substring(0,x));
            x--;
        }

        return sb.toString();

    }

}
