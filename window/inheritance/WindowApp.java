package window.inheritance;

public class WindowApp {

    public static void main(String args[]) {
        RectangularWindow rectangularWindow = new RectangularWindow(3, 5);
        CircularWindow circularWindow = new CircularWindow(2);

        System.out.println("RectangularWindow area: " + rectangularWindow.getArea());
        System.out.println("CircularWindow area: " + circularWindow.getArea());

        System.exit(0);
    }
}
