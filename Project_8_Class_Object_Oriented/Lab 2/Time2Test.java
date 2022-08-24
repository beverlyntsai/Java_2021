/**                                                
 * Time2Test.java
 * This Time2Test.java is based on sample Time2Test.java to add one more 
 * test case t6. In addition, the test hour, minute, second is different
 * from the original sample codes.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 

public class Time2Test 
{
   public static void main(String[] args)
   {
      Time2 t1 = new Time2(); // 00:00:00
      Time2 t2 = new Time2(3); // 03:00:00
      Time2 t3 = new Time2(20, 33); // 20:33:00
      Time2 t4 = new Time2(12, 24, 41); // 12:24:41
      Time2 t5 = new Time2(t4); // 12:24:41
      Time2 t6 = new Time2(t3); // 20:33:00

      System.out.println("Constructed with:");
      displayTime("t1: all default arguments", t1);
      displayTime("t2: hour specified; default minute and second", t2);
      displayTime("t3: hour and minute specified; default second", t3);
      displayTime("t4: hour, minute and second specified", t4);
      displayTime("t5: Time2 object t4 specified", t5);
      displayTime("t6: Time2 object t3 specified", t6);

      // attempt to initialize t6 with invalid values
      try
      {
         Time2 t7 = new Time2(28, 75, 98); // invalid values
      } 
      catch (IllegalArgumentException e)
      {
         System.out.printf("%nException while initializing t7: %s%n",
            e.getMessage());
      } 
   } 

   // displays a Time2 object in 24-hour and 12-hour formats
   private static void displayTime(String header, Time2 t)
   {
      System.out.printf("%s%n   %s%n   %s%n",
         header, t.toUniversalString(), t.toString());
   } 
} // end class Time2Test

