package decorator.discount;

public abstract class BeverageDiscounted {
  String description = "Unknown Discounted Beverage";
  double discount = 0;
  
  public String getDescription() {
    return description;
  }

  public double getDiscount() {
    return discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }
  
  public abstract double cost();
}
