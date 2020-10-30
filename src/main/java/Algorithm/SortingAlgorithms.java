package Algorithm;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class SortingAlgorithms {

    // bubbleSort
    public static void bubbleSort(Integer[] array){
        int size = array.length;
        for(int i = 0; i < size - 1; ++i){
            for(int j = 0; j < size - i - 1; ++j){
                if( array[j] > array[j+1] ){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    // insertionSort
    public static void insertionSort(Integer[] array){
        int size = array.length;
        for(int i = 1; i < size; ++i){
            int j = i - 1;
            int key = array[i];
            while(j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }

    // mergeSort
    public static void mergeSort(Integer[] array, int left, int right){
        int mid = left + ((right - left) >>> 1);
        if(left < right){
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private static void merge(Integer[] array, int left, int mid, int right){
        Integer[] leftArray = Arrays.copyOfRange(array, left, mid + 1);
        Integer[] rightArray = Arrays.copyOfRange(array, mid + 1, right + 1);
        int index = left;
        int i = 0, j = 0;

        while(i < leftArray.length && j < rightArray.length){
            if(leftArray[i] <= rightArray[j]){
                array[index++] = leftArray[i++];
            } else {
                array[index++] = rightArray[j++];
            }
        }

        if(i >= leftArray.length){
            while(j < rightArray.length){
                array[index++] = rightArray[j++];
            }
        } else {
            while(i < leftArray.length){
                array[index++] = leftArray[i++];
            }
        }
    }

    // Selection sort
    public static void selectionSort(Integer[] array){
        int size = array.length;
        int i = 0;
        while(i < size){
            int minVal_index = i;
            for(int j = i + 1; j < size; ++j){
                if(array[j] < array[minVal_index]){
                    minVal_index = j;
                }
            }

            Integer tmp = array[i];
            array[i] = array[minVal_index];
            array[minVal_index] = tmp;

            i++;
        }
    }

    public static void selectionSort2(Integer[] array){
        int size = array.length;
        int i = 0;
        while(i < size){
            for(int j = i + 1; j < size; ++j){
                if(array[j] < array[i]){
                    Integer tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
            i++;
        }
    }

    // Quick sort
    public static void quickSort(Integer[] array, int left, int right){
        if(left < right){
            int pivot = left;
            int i = left + 1, j = right - 1;
            while(i <= j){
                if(array[i] > array[pivot]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    j--;
                } else {
                    int temp = array[i];
                    array[i] = array[pivot];
                    array[pivot] = temp;
                    pivot = i;
                    i++;
                }
            }
            quickSort(array, left, pivot);
            quickSort(array, pivot + 1, right);
        }
    }

    // Counting sort
    public static void countingSort(Integer[] array){
        Integer[] result = Arrays.copyOf(array, array.length);
        int max_val = Arrays.stream(array).mapToInt(x -> x).max().orElseThrow(NoSuchElementException::new);
        int[] counter = new int[max_val+1];
        Arrays.stream(array).forEach(x -> counter[x]++);
        IntStream.range(1,counter.length).forEach(i -> counter[i] += counter[i-1]);
        Arrays.stream(result).forEach(x -> array[--counter[x]] = x);
    }

    // Radix sort
    public static void radixSort(Integer[] array){
        int max_val = Arrays.stream(array).mapToInt(x -> x).max().orElseThrow(NoSuchElementException::new);
        for(int factor = 1; max_val / factor > 0; factor *= 10){
            int[] counter = new int[10];
            Integer[] result = Arrays.copyOf(array, array.length);
            int finalFactor = factor;
            Arrays.stream(array).forEach(x -> counter[(x / finalFactor) % 10]++);
            IntStream.range(1,counter.length).forEach(i -> counter[i] += counter[i-1]);
            IntStream.range(-(result.length-1), 1)
                     .map(i -> -i)
                     .forEach(i -> array[--counter[(result[i] / finalFactor) % 10]] = result[i]);
        }
    }

    public static void main(String[] args){
        Integer[] array = new Integer[]{2,4,6,7,2,9,0,3,1,8,4};

        SortingAlgorithms.bubbleSort(array);
        System.out.println("BubbleSort" + Arrays.toString(array));

        array = new Integer[]{2,4,6,7,2,9,0,3,1,8,4};
        SortingAlgorithms.insertionSort(array);
        System.out.println("InsertionSort" + Arrays.toString(array));

        array = new Integer[]{2,4,6,7,2,9,0,3,1,8,4};
        SortingAlgorithms.mergeSort(array, 0, array.length-1);
        System.out.println("MergeSort" + Arrays.toString(array));

        array = new Integer[]{2,4,6,7,2,9,0,3,1,8,4};
        SortingAlgorithms.selectionSort(array);
        System.out.println("SelectionSort" + Arrays.toString(array));

        array = new Integer[]{2,4,6,7,2,9,0,3,1,8,4};
        SortingAlgorithms.selectionSort2(array);
        System.out.println("SelectionSort2" + Arrays.toString(array));

        array = new Integer[]{2,4,6,7,2,9,0,3,1,8,4};
        SortingAlgorithms.quickSort(array, 0, array.length);
        System.out.println("QuickSort" + Arrays.toString(array));

        array = new Integer[]{2,4,6,7,2,9,0,3,1,8,4};
        SortingAlgorithms.countingSort(array);
        System.out.println("CountingSort" + Arrays.toString(array));

        array = new Integer[]{170, 45, 75, 90, 802, 24, 2, 66};
        SortingAlgorithms.radixSort(array);
        System.out.println("RadixSort" + Arrays.toString(array));
    }
}
