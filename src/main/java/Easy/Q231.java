package Easy;

public class Q231 {
    public boolean isPowerOfTwo(int n) {
        return (n & (n-1))==0;
    }
}
