package DataStructure;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueues {
    private PriorityQueue<Integer> pq = new PriorityQueue<>();


    public static void siftDown(int k, Integer val, Integer[] array, int size){
        int key = val;
        int child;
        for(int half = size >>> 1; k < half; k = child){
            child = (k << 1) + 1;
            int right = (k << 1) + 2;
            int c = array[child];

            if(right < size && c > array[right]){
                child = right;
                c = array[right];
            }

            if(c < key){
                array[k] = c;
            } else {
                break;
            }
        }
        array[k] = key;
    }

    public static void siftUp(int k, Integer val, Integer[] array){
        Integer key;
        int parent;
        for(key = val; k > 0; k = parent){
            parent = (k - 1) >>> 1;
            int c = array[parent];
            if(c > key){
                array[k] = c;
            } else {
                break;
            }
        }
        array[k] = key;
    }

    public static void heapify(Integer[] array){
        int size = array.length;
        int k = (size >>> 1) - 1;
        while(k >= 0){
            siftDown(k, array[k], array, size);
            k--;
        }
    }

    public static void main(String[] args){
        Integer[] array = new Integer[]{2,4,6,7,2,9,0,3,1,8,4};
        int size = array.length;
        // create a heap
        heapify(array);

        System.out.println(Arrays.toString(array));

        // poll the first element
        siftDown(0, array[size-1], array, size-1);
        System.out.println(Arrays.toString(Arrays.copyOfRange(array, 0,size-1)));

        // offer an element to the end of the array
        array[size-1] = -2;
        siftUp(size-1, array[size-1], array);
        System.out.println(Arrays.toString(array));
    }
}
