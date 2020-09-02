package snackBarApp;

public class Main {

  public static void main(String[] args) {

    Customer c1 = new Customer("Customer 1", 37.75);
    System.out.println(c1.getName() + " cash on hand is " + c1.getCash());
  }
}
