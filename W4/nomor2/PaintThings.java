package W4.nomor2;

//************************************************************
// PaintThings.java
//
// Computes the amount of paint needed to paint various
// things. Uses the amount method of the paint class which
// takes any Shape as a parameter.
// Menghitung jumlah cat yang dibutuhkan untuk mengecat
// berbagai objek. Menggunakan metode amount dari kelas Paint
// yang menerima objek Shape sebagai parameter (polimorfisme).
//***********************************************************
import java.text.DecimalFormat;

public class PaintThings {
    // -----------------------------------------
    // Creates some shapes and a Paint object
    // and prints the amount of paint needed
    // to paint each shape.
    // Membuat beberapa bentuk dan objek Paint,
    // lalu mencetak jumlah cat yang dibutuhkan
    // untuk masing-masing bentuk.
    // -----------------------------------------
    public static void main(String[] args) {
        final double COVERAGE = 350; // cakupan cat per galon (kaki persegi)
        Paint paint = new Paint(COVERAGE);

        // Deklarasi variabel bentuk yang akan dicat
        Rectangle deck;
        Sphere bigBall;
        Cylinder tank;
        double deckAmt, ballAmt, tankAmt;

        // Instantiate the three shapes to paint
        // Membuat tiga objek bentuk dengan ukuran masing-masing
        deck = new Rectangle(20, 35);
        bigBall = new Sphere(15);
        tank = new Cylinder(10, 30);

        // Compute the amount of paint needed for each shape
        // Menghitung jumlah cat yang dibutuhkan untuk setiap bentuk
        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);

        // Print the amount of paint for each.
        // Mencetak hasil perhitungan dengan format satu desimal
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}