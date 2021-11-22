class Solution {
    public int secondHighest(String s) {
        Set<Integer> set = new HashSet<>();
        
        for(char c: s.toCharArray()) {
            if(Character.isDigit(c)) {
                set.add(Character.getNumericValue(c));
            }
        }
        
        if(set.isEmpty() || set.size() == 1)
            return -1;
        
        int max = -1, second = -1;
        
        for(int n: set) {
            if(n > max) {
                second = max;
                max = n;
            } else if(n > second) {
                second = n;
            }
        }
        
        return second;
    }
}