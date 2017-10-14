public class Arithmetic
{
   /**
      Computes the value of an arithmetic expression
      @param value1 the first operand
      @param operator a string that should contain an operator + - * or /
      @param value2 the second operand
      @return the result of the operation      
   */
   public static int compute(int value1, String operator, int value2)
   {
        int computed = 0;
        if (operator.equals("+"))
        {
            computed = value1 + value2;
        }
        
        else if (operator.equals("-"))
        {
            computed = value1 - value2;
        }
        
        else if (operator.equals("*"))
        {
            computed = value1 * value2;
        }
        
        else if (operator.equals("/"))
        {
            if (value2 == 0)
            {
                throw new IllegalArgumentException("Division by 0 is not allowed.");
            }
            computed = value1 / value2;
        }
        
        else
        {
            throw new IllegalArgumentException("Operator must be +, -, *, or /");
        }
       return computed; 
   }
}