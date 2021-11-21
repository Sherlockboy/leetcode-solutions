/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
	public int findInMountainArray(int target, MountainArray mountainArr) {
		int peak = peakIndexInMountainArray(mountainArr);
		int firstTry = orderAgonisticBinarySearch(mountainArr,target,0,peak);
		if(firstTry != -1){
			return firstTry;
		}
		//otherwise try to search in second half
		return orderAgonisticBinarySearch(mountainArr,target,peak+1,mountainArr.length()-1);
	}
	
	//find the peak element in the array
	public static int peakIndexInMountainArray(MountainArray mountainArr) {
		int start = 0;
		int end = mountainArr.length()-1;
		while(start < end){
			int mid = start + (end - start)/2;
			
			if(mountainArr.get(mid) > mountainArr.get(mid+1)){
				//you are in the dec part of the array
				//this may be ans but look at left
				//this is why end != mid - 1;
				end = mid;
			}else{
				//you are in the asc part of the array
				start = mid + 1; //becaus we know that mid + 1 element > mid element hence we ignoring mid element
			}
		}
		//in the end start == end and pointing to the largest number because of the above two checks
		//start and end are always trying to find max element in the above 2 checks
		//hence, when they are pointing to just one element, that is the max one because that is what the checks say
		//more ellaboration: at every point of time for start and end, they have the best possible answer till that time
		//and if we are saying that only one item is remaining, hence because of above line that is the best possible ans
		return start; // or return end as both are equal
	}

	//order agonistic binary search
	public static int orderAgonisticBinarySearch(MountainArray mountainArr, int target,int start,int end){

		//find wheather the array is sorted in ascending or descending order
		boolean isAsc = mountainArr.get(start) < mountainArr.get(end);

		while(start <= end){

			int mid = start + (end - start)/2;

			if(target == mountainArr.get(mid)){
				return mid;
			}
			//if the array is ascending 
			if(isAsc){
				if(target < mountainArr.get(mid)){
					end = mid - 1;
				}else{
					start = mid + 1;
				}
			}
			//if the array is descending
			else{
				if(target < mountainArr.get(mid)){
					start = mid + 1;
				}else{
					end = mid - 1;
				}
			}
		}
		return -1;
	}
}