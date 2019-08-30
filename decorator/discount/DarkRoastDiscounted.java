package decorator.discount;

public class DarkRoastDiscounted extends BeverageDiscounted {
  public DarkRoastDiscounted() {
    description = "Dark Roast Coffee Discounted";
  }
  
  public double cost() {
    return (.99 * (1 - getDiscount()));
  }
}