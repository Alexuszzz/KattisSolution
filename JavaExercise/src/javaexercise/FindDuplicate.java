package javaexercise;

public class FindDuplicate {
	
	public int findDuplicate(int [] nums) {
		
		int low = 1;
		int high = nums.length;
		int mid = low + (high -low) / 2;
		
		while(low < high) {
			int count = 0; 
			mid = low + (high -low) /2;
			for(int i = 0; i< nums.length; i++) {
				if(nums[i] <= mid) {
					count ++;
			}
				if(count > mid) {
					 high= mid;
				}else {
					 low = mid +1;
				 }
			}
		}				
		return low;		
		
	}

}
