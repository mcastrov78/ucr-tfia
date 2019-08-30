package decorator.discount;

public class MochaDiscounted extends CondimentDecoratorDiscounted {
  BeverageDiscounted beverage;

  public MochaDiscounted(BeverageDiscounted beverage) {
    this.beverage = beverage;
  }
  
  public String getDescription() {
    return beverage.getDescription() + ", Mocha Discounted";
  }
  
  public double cost() {
    double discountedCost = (.20 * (1 - (beverage.getDiscount() * 2)));
    return beverage.cost() + discountedCost;
  }
}