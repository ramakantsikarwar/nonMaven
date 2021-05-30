package string;

public class StringOnlyOneWord {

	public static void main(String[] args) {
		String sr = "Hello World Selenium";
		String words[] = sr.split("\\s");
		System.out.println(words[1]);

	}

}
