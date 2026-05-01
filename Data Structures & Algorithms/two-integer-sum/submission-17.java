class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int[] indexArray = new int[2];
        for(int i=0; i<n; i++){
            Integer com = target-nums[i];
            if(map.keySet().contains(com)){
                indexArray[0]=i;
                indexArray[1]=map.get(com);
                System.out.print(i+ " " + map.get(com));
                break;
            }else{
                map.put(nums[i],i);
            }
            // while(j<n){
            //     if(nums[i]+nums[j]==target){
            //         indexArray[0]=i;
            //         indexArray[1]= j;
            //         return indexArray;
            //     }
            //     j++;
            // }
        }
        Arrays.sort(indexArray);
        return indexArray;
    }
}
