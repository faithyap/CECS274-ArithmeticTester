public class ArithmeticTester3
{
   public static void main(String[] args)
   {
      call(3, "+", 4, "7");
      call(3, "-", 4, "-1");
      call(3, "*", 4, "12");
      call(13, "/", 4, "3");
      call(3, "@", 4, "Hello");
      call(13, "/", 0, "Hi");
   }

   public static void call(int a, String op, int b, String expected)
   {
      try
      {
         System.out.println("Output: " + Arithmetic.compute(a, op, b));
      }
      catch (Throwable exception)
      {	
    	 exception.printStackTrace(); 
      }
      System.out.println("Expected: " + expected);
   }
}