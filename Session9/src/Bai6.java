class Shape {
    public double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double side) {
        this.width = side;
        this.height = side;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    public boolean isSquare() {
        return width == height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

public class Bai6 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Rectangle(6);

        double totalArea = 0;

        System.out.println("Kết quả tính toán hình học:");

        for (int i = 0; i < shapes.length; i++) {
            Shape s = shapes[i];
            double area = s.calculateArea();
            totalArea += area;

            if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.printf("%d. Hình tròn (r=%.0f) - Diện tích: %.2f\n", i + 1, c.getRadius(), area);

            } else if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                if (r.isSquare()) {
                    System.out.printf("%d. Hình vuông (cạnh %.1f) - Diện tích: %.1f <-- Class Rectangle xử lý\n", i + 1, r.getWidth(), area);
                } else {
                    System.out.printf("%d. Hình chữ nhật (%.1f x %.1f) - Diện tích: %.1f\n", i + 1, r.getWidth(), r.getHeight(), area);
                }
            }
        }

        System.out.printf("\n=> Tổng diện tích các hình: %.2f", totalArea);
    }
}