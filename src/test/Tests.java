package test;

public class Tests {
	
	int id;  
    String name; 
	
	 Tests(int i,String n){  
		    id = i;  
		    name = n;  
		    }  

		int data=50;//instance variable  
		
		static int m=100;//static variable  
		String sts = "Test";
		boolean bol = true;
		
		public int methodTwo(int a, int b){  
		int n = a + b;//local variable 
		return n;
		}
		
		public static int methodOne(int a, int b, int c) {
			int sum;
			sum = a + b;
			return sum;	
		}
		
		public static int methodOne(int a, int b){  
			int n = a + b;//local variable 
			return n;
			}
	
	public static void main(String[] args){  
		
		int totalSum, totalSumTwo;
		totalSum = methodOne(179,2,4);
		totalSumTwo = methodOne(1,2);
		System.out.println("The sum of two integer is : " + totalSum);
		
	}

}
