package LeetCode.Easy;

public class FirstBadVersion {

    public int firstBadVersion(int n) {
        int res = findBadVersion(1, n);
        return res;
    }

    public int findBadVersion(int start, int end){
        if(start == end){
            return start;
        }

        int m = start + (end - start)/2;

//        if( isBadVersion(m) ){
        if(true){
            return findBadVersion(start, m);
        }else{
            return findBadVersion(m+1,end);
        }
    }
}
