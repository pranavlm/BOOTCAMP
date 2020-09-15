package java;

public class Exception {

		public static void main(String args[]) {
		      try {
		         int a[] = new int[2];
		         System.out.println(" element 3 is :" + a[3]);
		      } 
		      catch (ArrayIndexOutOfBoundsException e) 
		      {
		         System.out.println("Exception thrown  :" + e);
		      }
		      catch (NumberFormatException e) {
		    	  System.out.println("Exception thrown  :" + e);
		       }
		      catch (ArithmeticException e) {
		    	  System.out.println("Exception thrown  :" + e);
		       }
		      finally {

			      System.out.println("in finally block");
		          }
		   }
	
}
