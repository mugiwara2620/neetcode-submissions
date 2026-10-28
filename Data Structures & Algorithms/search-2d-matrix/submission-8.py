import numpy as np
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        m, n= len(matrix), len(matrix[0])

        start = 0
        end = m - 1
        row = -1

        while start <= end:
            md = (start + end) // 2
            if matrix[md][0] <= target and matrix[md][-1] >= target:
                row = md
                break
            elif matrix[md][0] > target:
                end = md - 1
            elif matrix[md][-1] < target:
                start = md + 1
        if row == -1:
            return False
            
        nums = matrix[row]
        len_nums = len(nums)
        start = 0
        end = len_nums - 1 
        print(row)
        while start <= end:
            m = (end - start) // 2 + start 
            if nums[m] > target:
                end = m -1
            elif nums[m] < target:
                start = m + 1
            else:
                return True
        return False
















            