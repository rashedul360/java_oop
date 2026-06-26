package UML;

import java.util.Scanner;

public class Main {
     public static void main() {
          Scanner input = new Scanner(System.in);
          Motorcycle m = new Motorcycle();
          System.out.print("Enter price : ");
          double price = input.nextDouble();
          System.out.print("Enter production year : ");
          input.next();
          String productionYear = input.nextLine();
          System.out.print("Enter registration number: ");
          input.next();
          String RegistrationNumber = input.nextLine();
          System.out.print("Enter engine capacity: ");
          double capacity = input.nextDouble();
          System.out.print("Enter model: ");
          input.next();
          String model = input.nextLine();
          System.out.print("Enter company: ");
          input.next();
          System.out.print("Enter dashboard size : ");
          double size = input.nextDouble();
          String company = input.nextLine();
          Motorcycle m1 = new Motorcycle(price, productionYear, RegistrationNumber, capacity, model, company);
          m1.createDashboard(size);
          m1.checkBattery();
          m1.checkFuel();
          double a = m1.dsahboard.size;
          input.close();
     }
}
