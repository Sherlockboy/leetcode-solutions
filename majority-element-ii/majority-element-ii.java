class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int n: nums) {
            if(map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        
        return map.entrySet().stream()
            .filter(e -> e.getValue() > nums.length/3)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
    }
}