package day.one;

public class SearchInsertPosition {
	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		System.out.println(searchInsert(nums, 7));
	}
	
	public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int rigth = nums.length-1;
        int middle = left + (rigth - left) / 2;
		
        while(left<=rigth) {
        	if(nums[middle] == target) {
        		return middle;
        	}
        	if(nums[middle]<target) {
        		left = middle + 1;
        	} else {
        		rigth = middle - 1;
        	}
        	middle = left + (rigth - left) / 2;
        }
		return middle;
    }
}
