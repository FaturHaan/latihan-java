package W4.nomor2;

//*****************************************
// Rectangle.java
//
// Represents a rectangle.
// Merepresentasikan bangun datar persegi panjang.
//*****************************************
public class Rectangle extends Shape {
    private double length; // panjang persegi panjang
    private double width; // lebar persegi panjang

    // ----------------------------------
    // Constructor: Sets up the rectangle.
    // Konstruktor: Menginisialisasi persegi panjang
    // dengan panjang dan lebar yang diberikan.
    // ----------------------------------
    public Rectangle(double l, double w) {
        super("Rectangle");
        length = l;
        width = w;
    }

    // -----------------------------------------
    // Returns the area of the rectangle.
    // Mengembalikan luas persegi panjang (panjang x lebar).
    // -----------------------------------------
    public double area() {
        return length * width;
    }

    // -----------------------------------
    // Returns the rectangle as a String.
    // Mengembalikan representasi String dari persegi panjang.
    // -----------------------------------
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }
}
