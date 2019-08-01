package window.inheritance;

public class Rectangle {
    
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getArea() {
        return (width * height);
    }
}