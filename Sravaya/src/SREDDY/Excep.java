package SREDDY;

public class Excep {static class Excp
	{
	 public static void main(String args[])
	 {
	  int a,b,c;
	  try
	  {
	   a=0;int
	   b1=10;
	   c=b1/a;
	   System.out.println("This line will not be executed");
	  }
	  catch(ArithmeticException e)
	  {
	   System.out.println("Divided by zero"); 
	  }
	  System.out.println("After exception is handled");
	 }
	

	}

}
