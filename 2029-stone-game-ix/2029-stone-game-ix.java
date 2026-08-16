class Solution {
    public boolean stoneGameIX(int[] stones) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        if(stones.length == 0)
        return false;
        for (int i = 0;i<stones.length;i++){
            if(stones[i]%3 == 0)
            count0++;
            else if(stones[i]%3 == 1)
            count1++;
            else
            count2++; 
        }      
        if(count1==0 && count2==0)
        return false;
        if(count0%2==0)
        return count1>0 && count2>0;
        
        return Math.abs(count1-count2) > 2;
        
    }
}