class Solution {
    public int findDuplicate(int[] nums) {
        int tortoise = nums[0], hare = nums[0];
        
        while(true) {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
            
            if(tortoise == hare)
                break;
        }
        
        tortoise = nums[0];
        
        while(tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        
        return tortoise;
    }
}