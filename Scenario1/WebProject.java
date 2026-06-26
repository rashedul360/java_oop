package Scenario1;

public class WebProject extends ProjectDetails {
     protected double hostingFee;

     private double total_amount = hostingFee;

     WebProject(double hostingFee, int projectId, String client_Name, double base_Price) {
          super(projectId, client_Name, hostingFee);
          this.hostingFee = hostingFee;
     }

     void calculateprice() {
          this.total_amount += (super.base_Price + hostingFee);
          this.total_amount += (this.total_amount * ((double) 10 / 100));
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
