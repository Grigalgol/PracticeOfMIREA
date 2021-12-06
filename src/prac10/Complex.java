package prac10;

public class Complex {
    double x;
    double y;

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Complex conk() {
        return new Complex(x, -y);
    }

    public Complex sub(Complex b) {
        return new Complex(x - b.x, y - b.y);
    }

    public Complex add(Complex b) {
        return new Complex(x + b.x, y + b.y);
    }

    public Complex mul(Complex b) {
        return new Complex(x * b.x, y * b.y);
    }

    public Complex mul(double b) {
        return new Complex(x * b, y * b);
    }

    public double len2() {
        return x * x + y * y;
    }

    @Override
    public String toString() {
        return "Complex = " + x + " + (" + y + "i)";
    }

    public static void main(String[] args) {
        ConcreteFactory test = new ConcreteFactory();
        System.out.println(test.createComplex(3, 4).mul(test.createComplex(3, 4)));
        System.out.println(test.createComplex(2, 1).add(test.createComplex(3, 2)));
    }
}
