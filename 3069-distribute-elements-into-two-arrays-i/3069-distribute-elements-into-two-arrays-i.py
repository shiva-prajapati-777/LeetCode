class Solution:
    def resultArray(self, nums: List[int]) -> List[int]:
        temp1=[nums[0]]
        temp2=[nums[1]]
        for i in range(2,len(nums)):
                if temp1[-1]>temp2[-1]:
                    temp1.append(nums[i])
                else:
                    temp2.append(nums[i])            
        return temp1 + temp2


