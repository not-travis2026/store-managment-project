public class Hat extends Clothing {
  private boolean isAdjustable;

  public Hat() {
    super();
    this.isAdjustable = true;
  }
  public Hat(String name, double price, boolean isAdjustable) {
    super(name,price);
    this.isAdjustable = isAdjustable;
  }
  public boolean getIsAdjustable() {
    return isAdjustable;
  }
  public void setIsAdjustable(boolean isAdjustable) {
    this.isAdjustable = isAdjustable;
  }
  public String toString() {
    String adjustabletext = isAdjustable ?"Yes" : "No";
    return "Hat deatils: " + super.toString() + "/One Size Fits All: " + adjustabletext;
      }
}