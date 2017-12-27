package Easy;

public class Q342 {
    public boolean isPowerOfFour(int num) {
        return (num & (num-1)) == 0 && (num-1)%3 == 0;
    }
}
