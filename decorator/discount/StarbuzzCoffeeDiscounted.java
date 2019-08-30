package decorator.discount;

public class StarbuzzCoffeeDiscounted {
  
  public static void main(String[] args) {
    BeverageDiscounted beverage = new DarkRoastDiscounted();  // Dark Roast Discounted
    printBeverage(beverage);                                  // no discount set

    beverage.setDiscount(0.1);                                // discount set
    printBeverage(beverage);

    beverage = new MochaDiscounted(beverage);                 // Wrap it with a Mocha Discounted
    printBeverage(beverage);
  }
  
  public static void printBeverage(BeverageDiscounted beverage) {
    System.out.println(beverage.getDescription() + " $" + beverage.cost());
  }
}