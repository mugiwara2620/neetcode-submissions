class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0: return 0

        nums.sort()
        a = nums[0]
        lcArray = [1]
        lc = 1
        print(nums)
        for x in nums:
            if x == a+1:
                lc+=1
                
            elif x>a+1:
                print(lc)
                lcArray.append(lc)
                lc=1
            a=x
        lcArray.append(lc)
        lcArray.sort()
        print(lcArray)
        return lcArray[-1]