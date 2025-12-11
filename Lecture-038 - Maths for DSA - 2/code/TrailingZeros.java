public class TrailingZeros {
    public int trailingZeroes(int n) {
        int res=0;
        int i=5;
        while(i<=n){
            res = res + n/i;
            i = i * 5;
        }
        return res;
    }
}
