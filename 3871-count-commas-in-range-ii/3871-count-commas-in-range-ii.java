class Solution {
    public long countCommas(long n) {
        long k = 1000, res = 0;
       while(k<=n){
        res += n - k +1;
        k *=1000;
       }
       return res;
    }
}