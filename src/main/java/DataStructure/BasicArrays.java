package DataStructure;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class BasicArrays {
    private static int[] arr1 = new int[10];
    private static int[] arr2 = new int[]{1, 2, 3, 4, 5};
    //    private int[] arr3 = new int[3]{1,3,4};   /* wrong */
    private static int[] arr4 = {1, 2, 3};
    private static Integer[] arr5 = new Integer[]{1,2,3,4,5};
    private static Integer[] arr6 = new Integer[]{1,2,3,4,5};

    private static List<Integer> arrList1 = Arrays.asList(1,2,3,4,5);  //Returns a fixed-size list
    private static List<Integer> arrList2 = Arrays.asList(arr5);

    private static int val1 = Arrays.binarySearch(arr2, 0);
    private static int val2 = Arrays.binarySearch(arr5, 0, (t1, t2) -> {
        if (t1 < t2) return 1;
        else if (t1 > t2) return -1;
        else return 0;
    });

    private static int val3 = Arrays.compare(arr2, arr4);
    private static boolean val4 = Arrays.deepEquals(arr5, arr6);



    public static void main(String[] args){
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        Arrays.fill(arr1, 11);
        Spliterator.OfInt split = Arrays.spliterator(arr1);

    }
}
