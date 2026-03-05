package W4.nomor2;

//******************************************************
// Paint.java
//
// Represents a type of paint that has a fixed area
// covered by a gallon. All measurements are in feet.
// Merepresentasikan jenis cat dengan cakupan area tetap
// per galon. Semua satuan ukuran dalam kaki.
//******************************************************
public class Paint {
    private double coverage; // number of square feet per gallon
                             // luas area (kaki persegi) yang dapat dicat per galon

    // -----------------------------------------
    // Constructor: Sets up the paint object.
    // Konstruktor: Menginisialisasi objek cat
    // dengan nilai cakupan per galon yang diberikan.
    // -----------------------------------------
    public Paint(double c) {
        coverage = c;
    }

    // ---------------------------------------------------
    // Returns the amount of paint (number of gallons)
    // needed to paint the shape given as the parameter.
    // Mengembalikan jumlah cat (dalam galon) yang dibutuhkan
    // untuk mengecat bentuk yang diberikan sebagai parameter.
    // ---------------------------------------------------
    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        // Luas permukaan dibagi cakupan per galon
        return s.area() / coverage;
    }
}