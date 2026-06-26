package Scenario1;

public class ProjectDetails {
     protected int projectId;
     protected String client_Name;
     protected double base_Price;

     ProjectDetails(int projectId, String client_Name, double base_Price) {
          this.projectId = projectId;
          this.client_Name = client_Name;
          this.base_Price = base_Price;
     }

     void calculateFinalInvoice() {
     }

     void printInvoice(double total_amount) {
          System.out.println("========================================");
          System.out.println("               INVOICE");
          System.out.println("========================================");
          System.out.printf("%-20s : %d%n", "Project ID", projectId);
          System.out.printf("%-20s : %s%n", "Client Name", client_Name);
          System.out.printf("%-20s : %.2f%n", "Base Price", base_Price);
          System.out.printf("%-20s : %.2f%n", "Total Price", total_amount);
          System.out.println("========================================");
     }

}
