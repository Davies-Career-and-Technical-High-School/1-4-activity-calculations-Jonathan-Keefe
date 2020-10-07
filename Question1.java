import java.util.Scanner;

class Question1 {
    public static void main(String[] args) {

        /* Write your code here */
      Scanner scan = new Scanner(System.in);
      int usernum;
      int one;
      int two;
      int three;
      int add1;
      int add2;
      int add3;
      int sub1;
      int sub2;
      int sub3;
      System.out.println("Enter starting number (must be an integer)");
      usernum = scan.nextInt();
      one = 1;
      two = 2;
      three = 3;
      
      add1 = usernum + one;
      add2 = usernum + two;
      add3 = usernum + three;

      sub1 = add3 - one;
      sub2 = add3 - two;
      sub3 = add3 - three;



      System.out.println("Spacer");
      System.out.println("number is now " + usernum); 
      System.out.println("number is now " + add1);
      System.out.println("number is now " + add2); 
      System.out.println("number is now " + add3);
      System.out.println("number is now " + sub1);
      System.out.println("number is now " + sub2);
      System.out.println("number is now " + sub3);        
    }
  
}