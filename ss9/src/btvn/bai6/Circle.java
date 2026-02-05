package btvn.bai6;

public class Circle extends SuperShape{
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int calculateArea() {
        return (int) (Math.PI * radius * radius);
    }
}
