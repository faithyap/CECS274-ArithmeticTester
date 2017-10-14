public class ArithmeticTester1
{
   public static void main(String[] args)
   {
      call(3, "+", 4, "7");
      call(3, "-", 4, "-1");
      call(3, "*", 4, "12");
      call(13, "/", 4, "3");
      call(3, "@", 4, "Operator must be + , - , * or  /");
      call(13, "/", 0, "Division by 0 is not allowed");
   }

   public static void call(int a, String op, int b, String expected)
   {
      try
      {
         System.out.println("Output: " + Arithmetic.compute(a, op, b) );
      }
      catch (Throwable exception)
      {	
    	 System.out.println(exception.getMessage());   

      }
      System.out.println("Expected: " + expected + "\n");
   }
}