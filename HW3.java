
public class HW3 {
	public static void printPowersOfN(int base, int exp) {
		int val=1;
		
		System.out.println();
		
		for(int i=0; i<exp;i++) {
			System.out.print(val+ "");
			val *=base; 
		}
	}	
	
	public static void main(String args[])
	{
	
		printPowersOfN(4, 3);
		printPowersOfN(5, 6);
		printPowersOfN(-2, 8);
		
     
	}

}
