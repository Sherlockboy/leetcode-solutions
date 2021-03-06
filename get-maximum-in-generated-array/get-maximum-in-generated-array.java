class Solution {
    public int getMaximumGenerated(int n) {
        if(n==0) return 0;
        
        int[] nums = new int[n+1];
        nums[1] = 1;
        
        int max = 1;
        for(int i=1; i<(n+1)/2; i++) {
            nums[2*i] = nums[i];
            nums[2*i+1] = nums[i] + nums[i+1];
            
            if(nums[2*i+1] > max) {
                max = nums[2*i+1];
            }
        }
        
        return max;
    }
}