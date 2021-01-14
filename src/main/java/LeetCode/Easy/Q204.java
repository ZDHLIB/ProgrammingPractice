package LeetCode.Easy;

public class Q204 {
    public int countPrimes(int n) {
        int res = 0;
        boolean[] flag = new boolean[n];
        for(int i = 2; i * i < n; i++){
            if( flag[i] ) continue;
            for(int k = i * i; k < n; k += i) flag[k] = true;
        }
        for(int i = 2; i < n; i++){
            if(!flag[i]){
                res++;
            }
        }
        return res;
    }
}
