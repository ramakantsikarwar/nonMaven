package string;

public class StringWordsReversal {

	public static void main(String[] args) {
		String sr = "Hello World Selenium";
		String rev = "";
		String words[]=sr.split("\\s");
		for(int i=0;i<=words.length-1;i++) {
			for(int j=words[i].length()-1;j>=0;j--) {
				rev = rev + words[i].charAt(j);
			}
			System.out.print(rev);
			rev=" ";
		}
		

	}

}
