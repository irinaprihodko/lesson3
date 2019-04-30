package preintermediate_level;
/*Given a string. Write a method
which swaps first and last characters
and returns a new modified string:
swapChar("Cool text") → "tool texC“*/

public class pre2 {
    public static void main(String[] args) {
       swapChar("Cool text");
    }
    public static void swapChar(String str){

        char chars[] = str.toCharArray();
        int len = chars.length - 1;
        char temp = chars[0];
        chars[0] = chars[len];
        chars[len] = temp;
        str = new String (chars);
        System.out.println(str);

    }
}


