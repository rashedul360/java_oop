package mid.problem3;

abstract class RideFare {
     private double total_fare;

     double getTotal() {
          return this.total_fare;
     }

     void setFare(double amount) {
          this.total_fare += amount;
     }

     abstract double calculateFare(double distance);

}
