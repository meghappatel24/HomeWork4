package Program1;

public class RemoveValueInt {

			public static void main(String[] args) {
			
			int[] numArray = {6,8,10,8,9,7,8,5,4,2,6,9};

			System.out.println("Enter Element to be deleted is 8: ");
			int element = 8;
			
			for(int i = 0; i < numArray.length; i++){
				if(numArray[i] == element){
				
					for(int j = i; j < numArray.length - 1; j++){
						numArray[j] = numArray[j+1];
					}
				
				}
			}
			
			System.out.println("Array elements after deletion-- " );
			for(int i = 0; i < numArray.length; i++){
				System.out.print(" " + numArray[i]);
			}  
		}
	}

