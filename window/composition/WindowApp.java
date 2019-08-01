package window.composition;

public class WindowApp {

    public static void main(String args[]) {
        Window window1 = new Window(new Rectangle(3, 5));
        Window window2 = new Window(new Circle(2));

        System.out.println("RectangularWindow 1 area: " + window1.getArea());
        System.out.println("CircularWindow 2 area: " + window2.getArea());

        window1.convertToAnotherShape(new Circle(2));
        System.out.println("Converted RectangularWindow 1 area: " + window1.getArea());

        System.exit(0);
    }
}
