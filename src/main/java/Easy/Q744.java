package Easy;

public class Q744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(letters[mid] <= target){
                start = mid + 1;
            } else if(letters[mid] > target){
                if(mid == 0){
                    break;
                }else if(letters[mid - 1] <= target){
                    return letters[mid];
                }else{
                    end = mid - 1;
                }
            }
        }
        return letters[0];
    }
}
