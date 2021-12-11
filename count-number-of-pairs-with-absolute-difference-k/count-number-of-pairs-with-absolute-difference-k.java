class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for(int i=0; i<nums.length; i++) {
            int key = nums[i]-k;
            if(key>0) {
                if(map.containsKey(key)) {
                    map.put(key, map.get(key)+1);
                } else {
                    map.put(key, 1);
                }
            }
        }
        
        for(int n: nums) {
            if(map.containsKey(n)) {
                count += map.get(n);
            }
        }
        
        return count;
    }
}