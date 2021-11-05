package day.three;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {2,3,4};
		for(int i : twoSum(nums, 6) ) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] twoSum(int[] numbers, int target) {
        int left =0;
        int rigth = numbers.length-1;
        int sum = 0;
        while (left<rigth) {
        	sum = numbers[left] + numbers[rigth];
        	if(sum == target) {
        		return new int[] {left+1,rigth+1};
        	}
        	if(sum > target) {
        		rigth--;
        	}else {
        		left++;
        	}
        }
        
		return null;
    }
}
