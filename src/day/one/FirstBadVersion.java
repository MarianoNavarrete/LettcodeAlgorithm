package day.one;



public class FirstBadVersion {
	public static void main(String[] args) {
		firstBadVersion(7);
	}
	
	public static int firstBadVersion(int n) {
		int left = 0;
		int rigth = n;
		int middle = left + (rigth - left) / 2;

		while(left <= rigth) {
			if(isBadVersion(middle)) {
				rigth = middle-1;
			}else {
				left = middle+1;
			}
			middle = left + (rigth - left) / 2;
		}

		return middle;
    }
	
	public static boolean isBadVersion(int a) {
		return true;
	}
}
