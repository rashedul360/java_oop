package abstraction;

public class Main {
     public static void main(String[] args) {
          MobileUser ms; // can't create object but web can create reference for superclass to access
                         // subclasss
          ms = new Rahim();
          ms.message();
          ms = new Karim();
          ms.message();

     }
}
