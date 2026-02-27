public class Rectangle extends Shape {
    private double width;
    private double length;

    // Memanggil constructor Shape() terlebih dahulu
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    // Constructor width dan length
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    // Mengirim color dan filled ke superclass menggunakan super
    public Rectangle(double width, double length,
                     String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getter untuk width
    public double getWidth() {
        return width;
    }

    // Setter untuk width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter untuk length
    public double getLength() {
        return length;
    }

    // Setter untuk length
    public void setLength(double length) {
        this.length = length;
    }

    // Hitung luas persegi panjang
    public double getArea() {
        return width * length;
    }

    // Hitung keliling persegi panjang
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Override method toString() dari Shape
    @Override
    public String toString() {
        return "A Rectangle with width=" + width +
               " and length=" + length +
               ", which is a subclass of " + super.toString();
    }
}