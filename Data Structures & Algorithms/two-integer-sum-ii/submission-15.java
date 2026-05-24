class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer,Integer> index = new HashMap<>();
        int left =0,  right= numbers.length-1;
        while(left<right && numbers[right]+numbers[left]!=target){
            if(numbers[right]+numbers[left]<target){
                left++;
            }else{
                right=right-1;
            }
        }

        return new int[]{left+1,right+1};
    }
}
