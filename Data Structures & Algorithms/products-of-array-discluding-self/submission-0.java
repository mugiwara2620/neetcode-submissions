class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        int s=1;
        int zero = 0;
        int i_zero = -1;
        for(int i=0; i<n;i++){
            if(nums[i]!=0){
                s*=nums[i];
            }else{
                i_zero=i;
                zero++;
            }
        }
        if(zero>1) return output;
        else if(zero==1){
            output[i_zero] = s;
            return output;
        }
        for(int j=0; j<n;j++){
            output[j]=s/nums[j];
        }
        return output;
    }
}  
