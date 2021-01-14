package LeetCode.Easy;

public class Q461 {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int combine = x ^ y;
        while(combine != 0){
            count += combine & 1;
            combine = combine >> 1;
        }
        return count;
    }
}
