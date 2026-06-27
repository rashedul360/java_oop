package mid.problem4;

import java.util.ArrayList;
import java.util.Date;

public class Order {
     private int orderId;
     private Date orderDate;
     private double total_amount = 0;
     private static ArrayList<MenuItem> items = new ArrayList<>();
     protected Customer customer;

     Order(int orderId, MenuItem[] items, int size, Customer cus) {
          this.orderId = orderId;
          this.orderDate = new Date();
          this.customer = cus;
          for (int i = 0; i < size; i++) {
               this.items.add(items[i]);
               this.total_amount += items[i].getPrice();
          }
     }

     public ArrayList<MenuItem> getItems() {
          return items;
     }

     public double getTotal_amount() {
          return total_amount;
     }

     public int getOrderId() {
          return orderId;
     }

     public Date getOrderDate() {
          return orderDate;
     }

     void displayOrder() {
          System.out.println("========== Order Details ==========");
          System.out.println("Order ID      : " + orderId);
          System.out.println("Order Date    : " + orderDate);

          System.out.println("\nCustomer Details");
          System.out.println("Customer ID   : " + customer.getCusId());
          System.out.println("Name          : " + customer.getName());
          System.out.println("Email         : " + customer.getEmail());

          System.out.println("\nOrdered Items");
          for (MenuItem item : items) {
               System.out.println("- " + item.getName() + " : " + item.getPrice());
          }

          System.out.println("\nTotal Amount  : " + total_amount);
          System.out.println("===================================");
     }
}
