public class test {
    // instance fields
    String productType;
      
    // constructor method
    public test(String product) {
      productType = product;
    }

    public void print(String a) {
      System.out.println(a);
    }
      
    // Add advertise method below
    public void advertise() {
      print("Come spend some money!");
      System.out.println("Selling"+ productType +"!");
    }
  
  public static void main(String[] args) {
      test test = new test("car");
      test.advertise();
  }


  }