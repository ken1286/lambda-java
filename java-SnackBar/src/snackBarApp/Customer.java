package snackBarApp;

public class Customer {

  private static int maxId = 0;
  private int id;
  private String name;
  private double cash;

  public Customer(String name, double cash) {
    maxId++;
    id = maxId;
    this.name = name;
    this.cash = cash;
  }

  public int getId() {
    return this.id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public double getCash() {
    return this.cash;
  }

  public void addCash(double cash) {
    this.cash += cash;
  }

  public void buySnacks(Snack snack, int quantity) {
    double totalCost = snack.getTotalCost(quantity);
    this.cash -= totalCost;
  }
}
