package Program1;

public class RemoveDuplicates {
	
	
	public static void main(String[] args) {
	
		new RemoveDuplicates();
	    char[] array = {'e','a','b','a','c','d','b','d','c','e'};
	     System.out.println("The given array is" );
	     System.out.println(array );
	    System.out.println("The new Array without the repeating Characters");
	    
	    RemoveDuplicates.newArray(array);
	  	    	
	        System.out.println(newArray(array));
	     	}

		
	private static char[] newArray(char[] array) {
	    String _array = "";
	    for(int i = 0; i < array.length; i++) {
	        if(_array.indexOf(array[i]) == -1) 
	            _array = _array+array[i];    
	    }
	    return _array.toCharArray();
	}
}

	