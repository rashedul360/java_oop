package Scenario1;

public class AppProject extends ProjectDetails {
     double appStorePublishingFee;
     private double total_amount = appStorePublishingFee;

     AppProject(double appStorePublishingFee, int projectId, String client_Name, double base_Price) {
          super(projectId, client_Name, appStorePublishingFee);
          this.appStorePublishingFee = appStorePublishingFee;
     }

     void calculateprice() {
          this.total_amount += (super.base_Price + appStorePublishingFee);
          this.total_amount += (this.total_amount * ((double) 15 / 100));
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