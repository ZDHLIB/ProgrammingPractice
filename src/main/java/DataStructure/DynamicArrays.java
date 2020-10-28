package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class DynamicArrays {

    private int size = 0;
    private int maxSize;
    private int sizeFactor = 2;
    private Integer[] array;
    private int initVal;

    public DynamicArrays(int initLength, int initVal){
        if(initLength < 2){
            throw new IllegalArgumentException("The initLength must be >= 2.");
        }
        this.maxSize = initLength;
        this.initVal = initVal;
        this.array = new Integer[this.maxSize];
        Arrays.fill(this.array, this.initVal);
    }

    public DynamicArrays(int initLength){
        this(initLength, 0);
    }

    public DynamicArrays(){
        this(16, 0);
    }

    public void add(Integer value){
        this.array[this.size++] = value;
        if(this.size == this.maxSize){
            this.extendArray();
        }
    }

    public void remove(int index){
        if(index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException("The index is out of bound.");
        }
        int newSize = this.size - 1;
        if(newSize > index){
            System.arraycopy(this.array, index + 1, this.array, index, newSize - index);
        }
        this.array[this.size = newSize] = this.initVal;
//        this.array = IntStream.range(0, this.maxSize).filter(i -> i != index).map(i -> this.array[i]).boxed().toArray(Integer[]::new);
    }

    public Integer valueAt(int index){
        if(index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException("The index is out of bound.");
        }
        return this.array[index];
    }

    public void setValueAt(int index, Integer val){
        if(index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException("The index is out of bound.");
        }
        this.array[index] = val;
    }

    public int size(){
        return this.size + 1;
    }

    public int maxsize(){
        return this.maxSize + 1;
    }

    private void extendArray(){
        this.maxSize = this.maxSize + (this.maxSize >> 1);
        Integer[] newArray = Arrays.copyOf(this.array, this.maxSize);
        if(this.initVal != 0){
            Arrays.fill(newArray, this.size, this.maxSize, this.initVal);
        }
        this.array = newArray;
    }

    public static void main(String[] args){
        DynamicArrays da = new DynamicArrays(4, 1);
        for(int i = 0; i < 20; i++){
            System.out.println(String.format("size %d, maxsize %d", da.size(), da.maxsize()));
            da.add(i);
        }
        da.remove(5);
        IntStream.range(0,da.size()-1).forEach(i -> System.out.print(String.format("%d,",da.valueAt(i))));
        ArrayList<Integer> test = new ArrayList<>();

    }

}
