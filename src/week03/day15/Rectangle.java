package week03.day15;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width > 0 && height > 0) {
            setWidth(width);
            setHeight(height);
        } else {
            System.out.println("Invalid arguments! Object's width and height were set to 0");
        }

    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
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

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

}
