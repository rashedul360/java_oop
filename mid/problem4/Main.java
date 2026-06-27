package mid.problem4;

import java.util.Scanner;

class A {
     int a = 10;

     void showD() {
          this.a = 20;
          System.out.print(a);
     }

     static void show() {

          System.out.print("not");
     }
}

public class Main {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          Customer c1 = new Customer(1, "rashedul", "ras@gmail.com");

          System.out.print("How many Item you want to order: ");
          int size = input.nextInt();
          input.nextLine();

          int i = 0;
          MenuItem[] items = new MenuItem[size];

          while (i < size) {
               System.out.print("Enter Menu name: ");
               String name = input.nextLine();

               System.out.println("Name = [" + name + "]");

               System.out.print("Enter Menu Price: ");
               double price = input.nextDouble();
               input.nextLine();
               items[i] = new MenuItem(name, price);
               i++;
          }

          input.close();

          Order o1 = new Order(i, items, size, c1);
          o1.displayOrder();
     }
}