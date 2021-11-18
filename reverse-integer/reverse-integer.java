class Solution {
    public int reverse(int x) {
        if(x<-2147483648 || x>2147483647) {
            return 0;
        }
        
        double reversed = 0;
        while(x != 0) {
            int reminder = x%10;
            x /= 10;
            reversed += reminder;
            if(x!=0) {
                reversed *= 10;
            }
        }
        
        if(reversed<-2147483648 || reversed>2147483647) {
            return 0;
        }
        
        return (int)reversed;
    }
}