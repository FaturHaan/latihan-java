package W4.nomor2;

//*****************************************
// Cylinder.java
//
// Represents a cylinder.
// Merepresentasikan bangun ruang silinder.
//*****************************************
public class Cylinder extends Shape {
    private double radius; // jari-jari alas silinder
    private double height; // tinggi silinder

    // ----------------------------------
    // Constructor: Sets up the cylinder.
    // Konstruktor: Menginisialisasi silinder
    // dengan jari-jari dan tinggi yang diberikan.
    // ----------------------------------
    public Cylinder(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }

    // -----------------------------------------
    // Returns the surface area of the cylinder.
    // Mengembalikan luas permukaan selimut silinder (π × r² × h).
    // -----------------------------------------
    public double area() {
        return Math.PI * radius * radius * height;
    }

    // -----------------------------------
    // Returns the cylinder as a String.
    // Mengembalikan representasi String dari silinder.
    // -----------------------------------
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
