package Easy;

public class Q467 {
    public int findComplement(int num) {
        int res = ~num;
        int mask = 0, pos = 0;
        while(mask<num){
            mask += (1<<pos++);
        }
        return res & mask;
    }
}
