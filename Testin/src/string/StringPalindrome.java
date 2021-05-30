package string;

public class StringPalindrome {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "nitin";
		String rev1 = "";
		String rev2 = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			rev1 += str1.charAt(i);
		}
		for (int j = str2.length() - 1; j >= 0; j--) {
			rev2 += str2.charAt(j);
		}
		if (str1.equals(rev1)) {
			System.out.println(str1 + " Str1 is a Palindrome " + rev1);
		} else {
			System.out.println(str1 + " Str1 is not a Palindrome " + rev1);
		}
		if (str2.equals(rev2)) {
			System.out.println(str2 + " Str2 is a Palindrome " + rev2);
		} else {
			System.out.println(str2 + " Str2 is not a Palindrome " + rev2);
		}
	}

}
