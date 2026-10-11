public class Clothing {
  private String name;
  private double price;

public Clothing() {
  this.name = "Unknown Item";
  this.price = 0.0;
}
  public Clothing (String name, double price) {
    this.name = name;
    this.price = price;
  }
  public String getName() {
    return name;
  }
  public double getPrice() {
    return price;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setPrice(double price) {
    this.price = price;
  }
  public String toString() {
    return name + "costs $" + price;
  }
}