package Scenario1;

public class MaintenanceContract extends ProjectDetails {
     protected int durationInMonths;
     private double total_amount = durationInMonths;

     MaintenanceContract() {
          this(0, 1, "", 1);
     }

     MaintenanceContract(int durationInMonths, int projectId, String client_Name, double base_Price) {
          super(projectId, client_Name, base_Price);
          this.durationInMonths = durationInMonths;
     }

     void calculateprice() {
          this.total_amount += (super.base_Price * this.durationInMonths);
          this.total_amount += (this.total_amount * ((double) 5 / 100));
          super.printInvoice(total_amount);
     }

     void calculateFinalInvoice() {
          this.calculateprice();
     }

     void calculateFinalInvoice(double discountPercentage) {
          double dis_price = this.total_amount * ((double) discountPercentage / 100);
          this.total_amount -= dis_price;
          this.calculateprice();
     }

     double getPrice() {
          return total_amount;
     }
}
