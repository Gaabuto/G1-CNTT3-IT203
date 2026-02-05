package btvn.bai6;

public class Rectangle extends SuperShape {
    public int width;
    public int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public int calculateArea() {
        return width * height;
    }
}
