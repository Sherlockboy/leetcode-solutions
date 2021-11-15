class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<Integer>();
        List<Integer> duplicates = new ArrayList<Integer>();
        
        for(int n: nums) {
            if(!uniqueNums.add(n)) {
                duplicates.add(n);
            }
        }
        
        return duplicates;
    }
}