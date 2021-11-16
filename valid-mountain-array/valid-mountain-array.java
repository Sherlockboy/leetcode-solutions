class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3)
            return false;
        
        int target = 0;
        
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] < arr[i+1]){
                target = i+1;
            } else {
                break;
            }
        }
        
        if(!(target>0 && target<arr.length-1))
            return false;
        
        for(int i=arr.length-1; i>target; i--) {
            if(arr[i] >= arr[i-1]){
                return false;
            }
        }
        
        return true;
    }
}