import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {

        /* Write your code here */
      Scanner scan = new Scanner(System.in);
      double radius;
      double circ;
      double area;
      double pi;
      System.out.println("Enter radius");
      radius = scan.nextInt();
      pi = 3.14;
      circ = 2 * pi * radius;
      area = pi * (radius * radius);
      
      
      



      System.out.println(circ);
      System.out.println(area);
    }
}