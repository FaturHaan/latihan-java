package W4.nomor2;

//*****************************************
// Sphere.java
//
// Represents a sphere.
// Merepresentasikan bangun ruang bola.
//*****************************************
public class Sphere extends Shape {
    private double radius; // radius in feet
                           // jari-jari bola (dalam satuan kaki)

    // ----------------------------------
    // Constructor: Sets up the sphere.
    // Konstruktor: Menginisialisasi bola
    // dengan jari-jari yang diberikan.
    // ----------------------------------
    public Sphere(double r) {
        super("Sphere");
        radius = r;
    }

    // -----------------------------------------
    // Returns the surface area of the sphere.
    // Mengembalikan luas permukaan bola (4 × π × r²).
    // -----------------------------------------
    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    // -----------------------------------
    // Returns the sphere as a String.
    // Mengembalikan representasi String dari bola.
    // -----------------------------------
    public String toString() {
        return super.toString() + " of radius " + radius;
    }
}
