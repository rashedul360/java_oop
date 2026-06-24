import java.util.Scanner;

public class Input {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.print("Enter a number: ");
          if (input.hasNextInt()) {
               Integer b = input.nextInt();
               System.out.println("Valid number: " + b);
          } else {
               System.out.println("Warning: This is not a number!");
          }
          input.close();
     }
}