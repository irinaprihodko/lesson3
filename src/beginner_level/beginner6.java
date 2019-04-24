package beginner_level;

public class beginner6 {

        /*Print all even numbers from range (0..50). Try to solve this in more than one way*/

        public static void main(String[] args) {
            /* The first way:

                for (int i = 0; i <=50; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
                The second way

            for (int i = 0; i <=50; i++) {
                 System.out.println(i);
                 i++;
                }
            }
                The third way:

*/
            for (int i = 0; i <= 50; i += 2) {
                System.out.print(i);
            }
        }
    }


