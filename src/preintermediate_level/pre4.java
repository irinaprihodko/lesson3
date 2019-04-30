package preintermediate_level;
/*Given an array of integers.
Write a method which prints the second half of the array.
Include the middle element to output,
if the array has odd number of elements*/
public class pre4 {
    public static void main(String[] args) {

        int[] arr = {11,27,3,4,156,6,9};

        for(int i=arr.length/2;i<arr.length-1;i++)
        {
            System.out.println( arr[i]);
        }
        System.out.println(arr[arr.length-1]);

    }
    /*для вывода {4,156, 6, 9}
        System.out.print('{');
        for(int i=arr.length/2;i<arr.length-1;i++)
        {
            System.out.print(String.format("%d, ", arr[i]));
        }
        System.out.println(String.format("%d}", arr[arr.length-1]));

    }*/

}
