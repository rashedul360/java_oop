package mid.problem4;

public class Customer {
     private int cusId;
     private String name;
     private String email;

     Customer(int cusId, String name, String email) {
          this.cusId = cusId;
          this.name = name;
          this.email = email;
     }

     public String getEmail() {
          return email;
     }

     public int getCusId() {
          return cusId;
     }

     public String getName() {
          return name;
     }

     public void setCusId(int cusId) {
          this.cusId = cusId;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public void setName(String name) {
          this.name = name;
     }

}
