package Program1;
import java.util.Arrays;
public class CombineOrder {

	
	
	public static void main(String args[]) { 
		
		System.out.println("Let 5 Varieties of Candy be the 5 elements of this Given array as Order # ");
		System.out.println("Index 0 is order for No# of Mint Candy");	
		System.out.println("Index 1 is order for No# of Choclates with Nuts Candy");
		System.out.println("Index 2 is order for No# of Chewy Choclates Candy");
		System.out.println("Index 3 is order for No# of Dark Choclate Candy");
		System.out.println("Index 4 is order for No# of Sugar free Suckers Candy");
		
		
	 int[] order1 = { 3,5,2,1,6 }; 
	 int[] order2 = { 1,3,7,5,8}; 
	 int[] result = add(order1, order2); 
	System.out.println("Quantity for Candy Order # 1 is " + Arrays.toString(order1)); 
	System.out.println("Quantity in Candy Order # 2 is  " + Arrays.toString(order2)); 
	System.out.println("Quantity for Combined Order is  " + Arrays.toString(result));  
	
	 }
		
	public static int[] add(int[] first, int[] second) {
		int length =5;
	int[] result = new int[length]; 
	for (int i = 0; i < length; i++)
	{ result[i] = first[i] + second[i]; } 
	return result; 
	} 
	}
	
	
	

