class Solution {
    public int minimumDeletions(int[] nums) {
       int left = 0; 
       int right = 0; 
       for(int i=0;i<nums.length;i++){
        if(nums[i] < nums[left])
        left = i;
        if(nums[i] > nums[right])
        right = i;
       }
       if(left < right){
        int temp = left;
        left = right;
        right = temp;
       }
       int res = nums.length;
       for(int i =0 ;i<=nums.length;i++){
        int extra = 0;
        if(right >= i)
        extra = nums.length - right;
        else if (left >= i)
        extra = nums.length - left;
        res = Math.min(res, i+extra);
       }
       return res;
    }
}