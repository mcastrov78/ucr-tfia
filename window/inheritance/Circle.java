package window.inheritance;

public class Circle {
    
    private static final float PI = 3.1415f;
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getArea() {
        return (radius * radius * PI);
    }
}