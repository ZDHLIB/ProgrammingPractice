package LeetCode.Easy;

public class Q657 {
    public boolean judgeCircle(String moves) {
        int[] mem = new int[4];  // 0: U, 1: D, 2: L, 3: R
        char[] opr = moves.toCharArray();
        for(char c : opr){
            switch (c){
                case 'U':
                    mem[0]++;
                    break;
                case 'D':
                    mem[1]++;
                    break;
                case 'L':
                    mem[2]++;
                    break;
                case 'R':
                    mem[3]++;
                    break;
            }
        }
        if( mem[0] == mem[1] && mem[2] == mem[3] ){
            return true;
        }
        return false;
    }
}
