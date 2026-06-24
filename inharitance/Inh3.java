package inharitance;

public class Inh3 extends Inh1 implements Inh2 {
     int a = 20;

     void PrintA() {
          super.display();
     }

     public void run() {
          System.out.println("abstract function implamentation for interface");
     }

     Inh3() {
          super();
          System.out.println("constructor of Inh3");
     }

     void display() {
          this.PrintA();
          System.out.println("dfs");
     }

     public static void main() {
          // note: we can't use this keyword inside static method
          Inh3 a = new Inh3();
          a.display();
     }
}
