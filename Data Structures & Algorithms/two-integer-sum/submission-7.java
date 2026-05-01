class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] indexArray = new int[2];
        // while(i<n && j>=0){
        //     if(nums[i]+nums[j]==target && i!=j){
        //         indexArray[0]=i;
        //         indexArray[1]= j;
        //         System.out.print(i+" " + j+" " + (int)(nums[i]));
        //         break;
        //     }else if(nums[i]+nums[j]>target){
        //         j=j-1;
        //     }else{
        //         i++;
        //     }
        // }
        for(int i=0; i<n; i++){
            int j=i+1;
            while(j<n){
                if(nums[i]+nums[j]==target){
                    indexArray[0]=i;
                    indexArray[1]= j;
                    return indexArray;
                }
                j++;
            }
        }
        Arrays.sort(indexArray);
        return indexArray;
    }
}
