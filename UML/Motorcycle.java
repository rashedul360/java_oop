package UML;

class Motorcycle extends Cycle {
     private double price;
     private String productionYear;
     private String RegistrationNumber;
     private Dashboard dsahboard; // aggrigation
     private Engine engine; // composition

     Motorcycle() { // if data is not available (safety check)
          super();
     }

     Motorcycle(double price, String productionYear, String RegistrationNumber, double capacity, String model,
               String company) {
          super(model, company);
          this.price = price;
          this.productionYear = productionYear;
          this.RegistrationNumber = RegistrationNumber;
          engine = new Engine(capacity);
     }

     public void createDashboard(double size) {
          dsahboard = new Dashboard(size);
     }

     public void checkFuel() {
          System.out.println("capacity remain: " + engine.showCapacity());
     }

     public void checkBattery() {
          System.out.println("Battery chacked!");
     }

}