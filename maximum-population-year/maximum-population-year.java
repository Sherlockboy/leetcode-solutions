class Solution {
    public int maximumPopulation(int[][] logs) {
        Map<Integer, Integer> years = new HashMap<>();
        
        for(int[] arr: logs) {
            if(!years.containsKey(arr[0])) {
                int count = 0;
                for(int[] record: logs) {
                    if(arr[0] >= record[0] && arr[0] < record[1]) {
                        count++;
                    }
                }
                years.put(arr[0], count);
            }
        }
        
        int maxCount = 0;
        for(Integer count: years.values()) {
            if(count > maxCount) {
                maxCount = count;
            }
        }
        
        int minYear = 2050;
        for (Map.Entry<Integer, Integer> entry : years.entrySet()) {
            if(entry.getValue() == maxCount && entry.getKey() < minYear) {
                minYear = entry.getKey();
            }
        }
             
        return minYear;
    }
}