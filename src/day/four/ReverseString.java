package day.four;

public class ReverseString {
	public static void main(String[] args) {
		char[] s = {'h', 'e','l','l','o'};
		reverseString(s);
		for(char letter : s) {
			System.out.print(letter + " ");
		}
	}
	
	public static void reverseString(char[] s) {
		int left = 0 ;
		int rigth = s.length-1;
		char pivot = ' ';
		while(left<rigth) {
			pivot = s[left];
			s[left] = s[rigth];
			s[rigth] = pivot;
			left++;
			rigth--;
		}
	}
}
