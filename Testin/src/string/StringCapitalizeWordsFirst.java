package string;

public class StringCapitalizeWordsFirst {

	public static void main(String[] args) {
		String str = "hello world selenium";
		String first = "";
		String Afterfirst="";
		String words[]=str.split("\\s");
		for(String w:words) {
			first = w.substring(0, 1).toUpperCase();
			Afterfirst = w.substring(1);
			System.out.print(first+Afterfirst+" ");
		}
	}

}
