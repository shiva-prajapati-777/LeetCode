class Solution {
    public boolean isValid(String s) {
        int head =0;
      if(s.length()%2 != 0)  return false;
      char[] stack = new char[s.length()];
      for(char c : s.toCharArray()){
        if(c=='('){
            stack[head++] = ')';
        }
        else if (c=='{'){
            stack[head++] = '}';
        }
        else if (c=='['){
            stack[head++] = ']';
        }
        else{
            if(head ==0 || stack[--head]!=c)
            return false;
        }
      }
      return head ==0;
    }
}