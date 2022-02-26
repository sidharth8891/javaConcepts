package test;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "test";
		String str1 = new String("test");
		String str3 = "test";
		String str4 = "testAutomationTesting";
		String str5 = " Testing ";
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str3));
		System.out.println(str==str1);
		System.out.println(str==str3);
		System.out.println(str.concat("Automation"));
		System.out.println(str+"Automation");
        str.concat("Automation");
		System.out.println(str);
		StringBuffer stringbuffer = new StringBuffer("12345");
		stringbuffer.append("6789");
		System.out.println(stringbuffer); // 123456789
		StringBuilder sb = new StringBuilder("0123456789");
		// StringBuilder delete(int startIndex, int endIndexPlusOne)
		System.out.println(sb.delete(3, 7));// 012789
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(3));
		System.out.println(str4.substring(4));
		System.out.println(str4.substring(4, 14));
		System.out.println(str4.replace("test","QA"));
		System.out.println(str4.toLowerCase());
		System.out.println(str4.toUpperCase());
		System.out.println(str5.trim());	
}

}
