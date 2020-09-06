package animalKingdomApp;

abstract class Animal {
  protected static int maxId;
  protected int id;
  protected String name;
  protected int yearNamed;

  public Animal() {
    maxId++;
    id = maxId;
  }
}
