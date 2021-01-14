package LeetCode.Easy;

public class Q202 {
    public boolean isHappy(int n) {
        int slow, fast;
        slow = fast = n;
        do{
            slow = getSum(slow);
            fast = getSum(fast);
            fast = getSum(fast);
        }while(slow != fast);
        if(slow == 1) return true;
        else return false;
    }

    private int getSum(int n){
        int res = 0;
        while (n > 0){
            res += (n%10) * (n%10);
            n /= 10;
        }
        return res;
    }
}
