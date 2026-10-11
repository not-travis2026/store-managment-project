public class Shirt extends Clothing {
  private String size;

public Shirt() {
  super();
  this.size ="M";
}
  public Shirt(String name, double price, String size) {
    super(name,price);
    this.size = size;
  }
  public String getSize() {
    return size;
  }
  public void setSize(String size) {
    this.size = size;
  }
  public String toString() {
    return "Shirt Details:" + super.toString() + "/Size:" + size;
  }
}