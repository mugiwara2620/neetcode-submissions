class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        array = []
        nums.sort()
        for i in range(0,len(nums)-2):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            right = len(nums) - 1
            left = i+1
            
            while left<right :
                target = nums[left] + nums[right] +nums[i]
                if target >0:
                    right-=1
                elif target <0:
                    left+=1
                else:
                    array.append([nums[left], nums[i], nums[right]])
                    left+=1
                    while left < right and nums[left] == nums[left-1]:
                        left += 1

        return array