package Easy;

public class Q717 {
    public boolean isOneBitCharacter(int[] bits) {
        int size = bits.length;
        int res = 0;

        if( bits[size-1] == 1 ) return false;

        for(int i = 0, j = 0; i < size-1; i++){
            if( bits[i] == 0 && j%2 == 0){
                res++;
            }else{
                j++;
            }
        }

        if( (size-1-res)%2 == 0 ){
            return true;
        }else{
            return false;
        }
    }


    public boolean isOneBitCharacter2(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }
}
