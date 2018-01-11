package Easy;

public class Q28 {
    public int strStr(String haystack, String needle) {
//        int haystackLen = haystack.length();
//        int needleLen = needle.length();
//        if(needleLen == 0) return 0;
//        if(haystackLen == 0) return -1;
//        int[] next = getNext(needle.toCharArray());
//        for(int i = 0, j = 0; i < haystack.length() && j < needle.length();){
//            if( j == -1 || haystack.charAt(i) == needle.charAt(j) ){
//                i++;
//                j++;
//                if( j == needle.length() ){
//                    return i-j;
//                }
//            }else{
//                j = next[j];
//            }
//        }
//        return -1;
        return haystack.indexOf(needle);
    }

    private int[] getNext(char[] target){
        int[] next = new int[target.length];
        next[0] = -1;
        int i = -1, j = 0;
        while(j < target.length-1){
            if(i==-1 || target[i] == target[j]){
                i++;
                j++;
                next[j] = i;
            }else{
                i = next[i];
            }
        }
        return next;
    }
}
