package Easy;

public class CountPrimes {

    public int countPrimes(int n) {
        boolean[] flag = new boolean[n];
        int count = 0;
        for(int i = 2; i*i < n; i++){
            if(flag[i]){
                continue;
            }
            for(int j = i*i; j < n; j += i){
                flag[j] = true;
            }
        }
        for(int i = 2; i < n; i++){
            if(!flag[i]){
                count++;
            }
        }
        return count;
    }
}
