class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        nums.sort()
        array = []
        for i in range(0,len(nums)):

            start = i+1
            end = len(nums) - 1
            middile = nums[i]

            while start < end:

                left = nums[start] 
                right = nums[end]
                
                sum_three = left + middile + right

                if sum_three == 0:
                    subarray = [left, middile, right]
                    if subarray not in array: array.append(subarray)
                    start+=1
                elif sum_three > 0:
                    end -=1
                else:
                    start +=1
            
        return array






























            