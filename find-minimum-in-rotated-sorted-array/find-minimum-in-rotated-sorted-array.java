class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        
        for(int n: nums) {
            if(min>n) {
                min = n;
            }
        }
        
        return min;
    }
}