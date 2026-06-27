package mid.problem4;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          Customer c1 = new Customer(1, "rashedul", "ras@gmail.com");
          System.out.print("How many Item you want to order: ");
          int size = input.nextInt();
          int i = 0;
          MenuItem[] items = new MenuItem[size + 4];
          while (i < size) {
               System.out.print("Enter Menu name: ");
               String name = input.nextLine();
               input.next();
               System.out.print("Enter Menu Price: ");
               double price = input.nextDouble();
               items[i] = new MenuItem(name, price);
               i++;
          }
          input.close();
          Order o1 = new Order(i, items, size, c1);
          System.out.println(o1.getTotal_amount());
          System.out.println(o1.customer.getName());
          System.out.println(o1.customer.getEmail());
     }
}
