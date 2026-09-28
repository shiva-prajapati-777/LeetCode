class Solution {
    public int maxDepth(String s) {
        int depth =0,  ans =0;
       for(char ch :s.toCharArray()){
        depth += ch == '(' ? 1:ch == ')' ? -1:0;
        ans = Math.max(ans,depth);
       }
       return ans;
    }
}