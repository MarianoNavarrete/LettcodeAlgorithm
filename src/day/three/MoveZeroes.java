package day.three;

public class MoveZeroes {
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
		for(int i : nums) {
			System.out.print(i+" ");
		}
	}
	
	public static void moveZeroes(int[] nums) {
		if(nums.length==0) {
			return;
		}
       int lastIndex = 0;
       int countZeroes = 0;
       for(int i=0;i<nums.length;i++) {
    	   if(nums[i]!=0) {
    		   nums[lastIndex] = nums[i];
    		   lastIndex++;
    	   }else {
    		   countZeroes++;
    	   }
       }
       for(int i=0;i<countZeroes;i++) {
    	   nums[lastIndex]=0;
    	   lastIndex++;
       }
    }
}
