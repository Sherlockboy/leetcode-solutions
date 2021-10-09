class Solution {
    public boolean isPalindrome(String s) {
        String reversed = "";
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        for(char c : s.toCharArray()) {
            reversed = c + reversed;
        }

        return reversed.equals(s);
    }
}