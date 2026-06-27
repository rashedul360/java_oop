package mid.problem3;

public class FixedFare extends RideFare {
     double calculateFare(double distance) {
          double amount = distance * 10.0;
          super.setFare(amount);
          return amount;
     }
}
