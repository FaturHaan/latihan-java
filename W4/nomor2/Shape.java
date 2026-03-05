package W4.nomor2;

//*****************************************
// Shape.java
//
// Represents a generic shape.
// Merepresentasikan bentuk geometri secara umum (abstrak).
//*****************************************
public abstract class Shape {
    protected String shapeName; // nama bentuk geometri

    // ----------------------------------
    // Constructor: Sets up the shape name.
    // Konstruktor: Menetapkan nama bentuk geometri.
    // ----------------------------------
    public Shape(String name) {
        shapeName = name;
    }

    // -----------------------------------------
    // Abstract method to calculate the area.
    // Metode abstrak untuk menghitung luas permukaan.
    // Setiap subkelas wajib mengimplementasikan metode ini.
    // -----------------------------------------
    public abstract double area();

    // -----------------------------------
    // Returns the shape name as a String.
    // Mengembalikan nama bentuk sebagai String.
    // -----------------------------------
    public String toString() {
        return shapeName;
    }
}
