package mid.problem3;

public class DiscountedFare extends RideFare {
     double calculateFare(double distance) {
          double amount = distance * 10.0 * 0.75;
          super.setFare(amount);
          return amount;
     }
}
