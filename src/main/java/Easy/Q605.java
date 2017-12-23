package Easy;

public class Q605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 1;
        int res = 0;
        for( int f : flowerbed ){
            if( f == 0 ){
                count++;
            }else {
                res += (count-1)/2;
                count=0;
            }
        }
        res += count/2;
        return (res >= n);
    }
}
