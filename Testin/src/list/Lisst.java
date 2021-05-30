package list;

import java.util.ArrayList;
import java.util.Collections;

public class Lisst {

	public static void main(String[] args) {
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("you");
		lst.add("me");
		lst.add("hum");
		
		Collections.sort(lst);
		
		for(String str :lst) {
			System.out.println(str);
		}
	}

}
