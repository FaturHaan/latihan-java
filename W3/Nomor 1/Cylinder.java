public class Cylinder extends Circle { // Save as "Cylinder.java"
    private double height; // private variable

    // Constructor with default color, radius and height
    public Cylinder() {
        super(); // call superclass no-arg constructor Circle()
        this.height = 1.0;
    }

    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius); // call superclass constructor Circle(radius)
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    // Override method getArea()
    // Pada Circle, getArea() = luas lingkaran (πr²)
    // Pada Cylinder, kita ubah maknanya menjadi luas permukaan tabung
    // super.getArea() dipakai untuk mengambil luas alas lingkaran (πr²)
    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    // A public method for computing the volume of cylinder
    // use superclass method getArea() to get the base area
    public double getVolume() {
        return super.getArea() * height;
    }

    // Override toString()
    // Menggunakan super.toString() agar informasi dari Circle
    // radius dan color tetap ditampilkan
    // lalu menambahkan informasi height milik Cylinder
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString()
            + " height=" + height;
    }
}
