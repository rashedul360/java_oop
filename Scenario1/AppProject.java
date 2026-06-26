package Scenario1;

public class AppProject extends ProjectDetails {
     double appStorePublishingFee;
     private double total_amount;

     AppProject(double appStorePublishingFee, int projectId, String client_Name, double base_Price) {
          super(projectId, client_Name, base_Price);
          this.appStorePublishingFee = appStorePublishingFee;
     }

     void calculateprice() {
          double subTotal = super.base_Price + this.appStorePublishingFee;
          double tax = subTotal * 0.15;
          this.total_amount = subTotal + tax;
     }

     @Override
     void calculateFinalInvoice() {
          this.calculateprice();
          super.printInvoice(this.total_amount);
     }

     void calculateFinalInvoice(double discountPercentage) {
          this.calculateprice();

          double dis_price = this.total_amount * (discountPercentage / 100.0);
          this.total_amount -= dis_price;

          super.printInvoice(this.total_amount);
     }

     double getPrice() {
          return total_amount;
     }
}