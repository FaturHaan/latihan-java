public class TestShape {
    public static void main(String[] args) {

        // Membuat objek Shape menggunakan constructor berparameter
        Shape s = new Shape("red", false);
        System.out.println(s);

        // Membuat objek Circle dengan radius, color, dan filled
        Circle c = new Circle(5.0, "blue", true);
        System.out.println(c);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());

        // Membuat objek Rectangle dengan width dan length
        Rectangle r = new Rectangle(4.0, 6.0, "yellow", true);
        System.out.println(r);
        System.out.println("Area: " + r.getArea());

        // Membuat objek Square (subclass dari Rectangle)
        Square sq = new Square(4.0, "black", true);
        System.out.println(sq);
        System.out.println("Area: " + sq.getArea());

        // Mengubah lebar persegi menjadi 10
        sq.setWidth(10);
        System.out.println("After setWidth(10): " + sq);
    }
}