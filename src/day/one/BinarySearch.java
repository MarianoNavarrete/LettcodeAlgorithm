package day.one;

public class BinarySearch {
	public static void main(String[] args) {
		int[] nums = {2,5};
		System.out.println(search(nums, 5));
	}
	
	public static int search(int[] nums, int target) {

			int left = 0;
			int rigth = nums.length - 1;
			int middle = left + (rigth - left) / 2;
			if(nums[middle] == target) {
				return middle;
			}
			while(left <= rigth) {
				if(nums[middle] == target) {
					return middle;
				}
				if(nums[middle]<target) {
					left = middle+1;
				}else {
					rigth = middle-1;
				}
				middle = left + (rigth - left) / 2;
			}

			return -1;
	}
}
