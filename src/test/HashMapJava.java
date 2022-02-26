package test;

import java.util.HashMap;
import java.util.Map;

public class HashMapJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //Hashmap doesnt allow duplicate key, but allows duplicate values
		//hashmap allows null key but only once,multiple null values supported
		// int hash, key, value,node
		//Hashmap is not synchronized
		//Hashmap doesnt maintain insertion order (Treemap/LinkedhashMap)
		        // initialize a HashMap
		        HashMap<String, Integer> map = new HashMap<>();
		 
		        // Add elements using put method
		        map.put("vishal", 10);
		        map.put("sachin", 30);
		        map.put("vaibhav", 20);
		        map.remove("vishal", 10);
		        map.replace(null, null);
		        System.out.println(map);
		 
		        // Iterate the map using
		        // for-each loop
		        for (Map.Entry<String, Integer> e : map.entrySet())
		            System.out.println("Key: " + e.getKey()
		                               + " Value: " + e.getValue());
		    }

	

}
