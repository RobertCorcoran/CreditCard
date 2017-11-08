import javax.swing.JOptionPane; 

/*
   this program uses two void methods.
*/

public class CreditCard
{
   public static void main(String[] args)
   {
      double salary;    //annual salary
      int creditRating;    //Credit rating
      String input;        //to hold the user's input
      
      // get the users annual salary.
      input = JOptionPane.showInputDialog("What is " +
                              " your annual salary?");
      salary = Double.parseDouble(input);
      
      // get the users credit rating (1 through 10)
      input = JOptionPane.showInputDialog("On a scale of " +
               " 1 through 10, what is your credit rating?\n" +
               "(10 = excellent, 1 = ver bad)");
      creditRating = Integer.parseInt(input);
      
      //determine whether the user qualifies.
      if (salary >= 20000 && creditRating >= 7)
         qualify();
      else
         noQualify();
         
      System.exit(0);
      
   }
   
   /**
      The qualify method informs the user that they 
      qualify for the credit card.
   */
   
   public static void qualify()
   {
      JOptionPane.showMessageDialog(null, "Congratulations! " +
                        "You qualify for the credit card!");
   }
   
   /**
      The noQualify method informs the user that they
      do not qualify for the credit card.
   */
   
   public static void noQualify()
   {
      JOptionPane.showMessageDialog(null, "I'm sorry. You " +
                  " aren't strong enough for my potions.");
   }
}