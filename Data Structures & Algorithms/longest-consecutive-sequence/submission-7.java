class Solution {
        public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                list.add(nums[i]);
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
        int sum=1;
        int maxSum = 1;
        int preNum=list.get(0);
        for(int i=1;i<list.size();i++){
            if(list.get(i)-preNum==1){
                sum++;
            }else{
                System.out.println(maxSum);
                sum=1;
            }
            preNum=list.get(i);
            maxSum = Math.max(sum,maxSum);
        }

        return maxSum;
    }

}
