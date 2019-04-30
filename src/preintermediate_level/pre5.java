package preintermediate_level;
/*You don't like number 7 and number 9.
Write a method which checks input array and returns True
if the array doesn't contain your unloved numbers*/

public class pre5 {
    public static void main(String[] args) {
        System.out.println(check(new int[]{1, 9, 18, 23}));
    }
    public static boolean check(int[] array) {
        boolean isGood = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] == 7 || array[i] == 9)
                        isGood = false;
                }
                return isGood;
    }
}



