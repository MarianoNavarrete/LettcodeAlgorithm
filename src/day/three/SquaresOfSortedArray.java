package day.three;

import java.util.Arrays;

public class SquaresOfSortedArray {
	public static void main(String[] args) {
		int[] nums = {-4,-1,0,3,10};
		for(int value : sortedSquares(nums)) {
			System.out.println(value);
		}
	}

	public static int[] sortedSquares(int[] nums) {
		return Arrays.stream(nums).map(num -> (int) (Math.pow((double) num, (double) 2))).sorted().toArray();
	}
}
