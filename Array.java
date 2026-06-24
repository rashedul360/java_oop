import java.util.Scanner;

public class Array {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.print("enter array size");
          int size = input.nextInt();

          int[] arr = new int[size];
          for (int i = 0; i < size; i++) {
               System.out.print("Enter element " + (i + 1) + ": ");
               while (!input.hasNextInt()) {
                    System.out.println("Invalid input! Please enter an integer:");
                    System.out.print("Enter element " + (i + 1) + ": ");
                    input.next();
               }
               arr[i] = input.nextInt();

          }
          for (int i = 0; i < arr.length; i++) {
               System.out.println(arr[i]);
          }
          input.close();
     }
}