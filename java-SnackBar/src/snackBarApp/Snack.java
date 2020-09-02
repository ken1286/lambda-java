package snackBarApp;

public class Snack {

  private static int maxId = 0;

  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;

  public Snack(String name, int quantity, double cost, int vendingMachineId) {
    maxId++;
    id = maxId;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineId = vendingMachineId;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCost() {
    return this.cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public int getVendingMachineId() {
    return this.vendingMachineId;
  }

  public void setVendingMachineId(int vendingMachineId) {
    this.vendingMachineId = vendingMachineId;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void addQuantity(int quantity) {
    this.quantity += quantity;
  }

  public void buySnack(int quantity) {
    this.quantity -= quantity;
  }

  public double getTotalCost(int quantity) {
    return this.cost * quantity;
  }
}
