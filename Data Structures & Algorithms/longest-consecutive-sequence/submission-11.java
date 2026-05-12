class Solution {
        public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int con = 1;
        int maxC = 1;
        Set<Integer> set = Arrays.stream(nums)
                         .boxed()
                         .collect(Collectors.toSet());
        for(int num : nums){
            int j = num;
            while(set.contains(j+1)){
                j++;
                con ++;
            }
            maxC = Math.max(con,maxC);
            con = 1;             
        }

        return maxC;
    }

}
