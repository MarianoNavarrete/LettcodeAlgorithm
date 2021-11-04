package day.three;

public class RotateArray {
	public static void main(String[] args) {
		int[] nums = {1,2};
		rotate(nums, 3);
		for(int i : nums) {
			System.out.print(i + " ");
		}
	}
	
	public static void rotate(int[] nums, int k) {
		if(nums.length==1) {
			return;
		}
        int[] numsRotate = nums.clone();
        int arrLength = nums.length;
        int index = 0;
        for(int i=0;i<arrLength;i++) {
        	index = i + k;
        	while(index>arrLength-1) {
        		index = index - arrLength;
        	}
        	nums[index] = numsRotate[i];
        }
        
    }
}
