class Solution {
    public int reverseDegree(String s) {
        int res = 0;
        for(int i = 0;i<s.length();i++){
            int value = 'z' - s.charAt(i)+1;
            res += value *(i+1);
        }
        return res;
    }
}