public class Square extends Rectangle {

    // Memanggil constructor Rectangle dengan width dan length = 1.0
    public Square() {
        super(1.0, 1.0);
    }

    // Constructor dengan satu parameter side
    public Square(double side) {
        super(side, side);
    }

    // Memanggil constructor Rectangle(double, double, String, boolean)
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Mengambil nilai sisi
    public double getSide() {
        return getWidth();
    }

    // Mengatur nilai sisi
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Override agar width & length selalu sama
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Override setLength agar setiap perubahan length juga otomatis mengubah width
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Override toString untuk memberikan deskripsi khusus Square
    @Override
    public String toString() {
        return "A Square with side=" + getWidth() +
               ", which is a subclass of " + super.toString();
    }
}