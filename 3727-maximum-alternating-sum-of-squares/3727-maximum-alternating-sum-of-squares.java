class Solution {
    public long maxAlternatingSum(int[] nums) {
        long []a = new long[nums.length];
        for(int i =0;i<nums.length;i++)
        a[i] =(long) nums[i]*nums[i];
        Arrays.sort(a);
        long ans =0;
        int x = nums.length/2;
        for(int i =0;i<x;i++)
        ans -=a[i];
        for(int i =x;i<nums.length;i++)
        ans+= a[i];
        
        return ans;
    }
}