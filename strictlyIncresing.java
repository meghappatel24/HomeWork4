package Program1;

public class strictlyIncresing {

public static boolean isStrictlyIncreasing(double[] in)
			
{
           boolean isIncreasing = true;
           System.out.println(" In the given array of integers  ");
				for (int i = 0; i < in.length - 1; i++)
				{
					if (in[i] >= in[i+1])
						isIncreasing = false;
					
					System.out.println(" " +in[i]);
				}
					
				return isIncreasing;
			}
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				double[] in = {1,4,9,16,25,36,49,64,81};
				System.out.println(isStrictlyIncreasing(in));
				System.out.println(" In the given array; it returns the value true if the value before it is smaller otherwise false." );
			}
		
			
		}

