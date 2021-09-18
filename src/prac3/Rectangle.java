package prac3;

public class Rectangle extends Shape{

    protected double width;
    protected double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimetr() {
        return 2*length + 2*width;
    }

    @Override
    public String toString() {
        return (super.isFilled()? "filled" : "not filled") + "\nArea = " + getArea() +
                "\nPerimetr = " + getPerimetr() + "\nLength = " + getLength() + "\nWidth = " + getWidth() + "\nColor " + super.getColor();
    }
}
