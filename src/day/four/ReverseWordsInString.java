package day.four;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInString {
	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}
	
	public static String reverseWords(String s) {
		return Arrays.stream(s.split(" ")).map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
    }
}
