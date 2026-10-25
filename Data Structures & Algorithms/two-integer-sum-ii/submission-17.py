class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:

        start = 0
        end = len(numbers) - 1

        while start < end :
            right = numbers[start]
            left = numbers[end]

            sum_two = right + left

            if sum_two == target:
                return [start+1, end+1]
            elif sum_two > target:
                end -= 1
            else:
                start +=1
        

        