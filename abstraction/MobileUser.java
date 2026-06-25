package abstraction;

abstract class MobileUser {
     void Bye() {
          System.out.print("non abastract method");
     }

     abstract void message();
}

// only function only exist inside the abstract class
// do not have body of abstract method
// method ends with ;
// abstract methiod must be overwritten
// abstract method can't be declared as static or final. (public, protected are
// allowed)
// in abstraction class we can write abstract or non abstract method