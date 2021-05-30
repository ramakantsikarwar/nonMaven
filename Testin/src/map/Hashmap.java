package map;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    capitalCities.replace("USA", "Don;t");
	    System.out.println(capitalCities);
	    
	    for(HashMap.Entry<String, String> mapwa:capitalCities.entrySet()) {
	    	System.out.println(mapwa.getKey()+ ":" +mapwa.getValue());
	    	
	    }

	}

}
