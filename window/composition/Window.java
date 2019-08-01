package window.composition;

public class Window {

    private Shape shape;

    public Window(Shape shape) {
        this.shape = shape;
    }

    public void convertToAnotherShape(Shape anotherShape) {
        this.shape = anotherShape;
    }

    public float getArea() {
        return shape.getArea();
    }

}