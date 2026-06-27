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
}
