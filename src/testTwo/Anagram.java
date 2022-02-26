package testTwo;

import java.util.Arrays;

public class Anagram {
	  
	    public static void main(String[] args) 
	    { 
	        String s[] = "i like this program very much".split(" "); 
	        String ans = ""; 
	        String revword = "";
	        for (int i = s.length - 1; i >= 0; i--) { 
	        	String s1[] = s[i].split("");
	        	for (int j = s1.length-1; j>=0; j--)
	        		{revword =  revword +s1[j] + " " ;}
	        	 
	        } ans = ans + " "+revword + " ";
	        System.out.println("Reversed String:"); 
	        System.out.println(ans); //.substring(0, ans.length() - 1)
	    } 
	} 




