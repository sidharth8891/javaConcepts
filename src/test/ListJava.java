package test;

import java.util.ArrayList;
import java.util.List;

public class ListJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List starts from 0 
		List<String> lst = new ArrayList<>();
		lst.add("test");
		lst.add("automation");
		//lst.toArray();
		//lst.remove(1);
		System.out.println(lst.size());
		//lst.isEmpty();
		for (String lstr : lst) {
			System.out.println(lstr);
		}
		 for (int i = 0; i < lst.size(); i++) {

			            System.out.print(lst.get(i) + " ");
			        }
		
		// Creating an empty Arraylist of string type
//        List<String> al = new ArrayList<>();
// 
//        // Adding elements to above object of ArrayList
//        al.add("Automation");
//        al.add("Automation");
// 
//        // Adding element at specified position
//        // inside list object
//        al.add(1, "Test");
// 
//        // Using  for loop for iteration
//        for (int i = 0; i < al.size(); i++) {
// 
//            // Using get() method to
//            // access particular element
//            System.out.print(al.get(i) + " ");
//        }
 
        // New line for better readability
//        System.out.println();
// 
//        // Using for-each loop for iteration
//        for (String str : al)
// 
//            // Printing all the elements
//            // which was inside object
//            System.out.print(str + " ");

	}
	//task is to try remove method

}
