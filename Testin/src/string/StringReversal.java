package string;

public class StringReversal {

	public static void main(String[] args) {
		String sr = "Hello World Selenium";
		String rev = "";
		int len = sr.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + sr.charAt(i);
		}
		System.out.println(rev);
	}

}
