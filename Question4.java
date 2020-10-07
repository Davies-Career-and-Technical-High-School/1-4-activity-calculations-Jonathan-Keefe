import java.util.Scanner;

class Question4 {
    public static void main(String[] args) {

        /* Write your code here */
      Scanner scan = new Scanner(System.in);
      double price;
      double bill;
      double owed;
    
      System.out.println("Enter a price");
      price = scan.nextDouble();
      bill = 20;
      owed = bill - price;
      
      
      
      



      System.out.println("Change from $20: $" + owed);
      
    }
}