package W4.nomor3;

// *******************************************************
// Salesperson.java
//
// Represents a sales person who has a first name, last
// name, and total number of sales.
// Merepresentasikan seorang tenaga penjual dengan nama
// depan, nama belakang, dan total penjualan.
// *******************************************************
public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName; // nama depan dan nama belakang
    private int totalSales; // total penjualan

    // ------------------------------------------------------
    // Constructor: Sets up the sales person object with
    // the given data.
    // Konstruktor: Menginisialisasi objek tenaga penjual
    // dengan data yang diberikan.
    // ------------------------------------------------------
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    // -------------------------------------------
    // Returns the sales person as a string.
    // Mengembalikan data tenaga penjual sebagai String.
    // -------------------------------------------
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    // -------------------------------------------
    // Returns true if the sales people have
    // the same name.
    // Mengembalikan true jika kedua tenaga penjual
    // memiliki nama yang sama.
    // -------------------------------------------
    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName()) &&
                firstName.equals(((Salesperson) other).getFirstName()));
    }

    // --------------------------------------------------
    // Order is based on total sales with the name
    // (last, then first) breaking a tie.
    // Urutan didasarkan pada total penjualan, dengan nama
    // belakang lalu nama depan sebagai pemutus seri.
    // --------------------------------------------------
    public int compareTo(Salesperson otherPerson) {
        // Compare total sales first
        // Bandingkan total penjualan terlebih dahulu
        if (this.totalSales != otherPerson.getSales()) {
            return this.totalSales - otherPerson.getSales();
        }

        // Break tie with last name
        // Gunakan nama belakang sebagai pemutus seri pertama
        int lastCompare = this.lastName.compareTo(otherPerson.getLastName());
        if (lastCompare != 0) {
            // Reverse alphabetical (multiply by -1) since insertionSort is now descending
            // Dibalik (dikali -1) karena insertion sort menggunakan urutan menurun
            return lastCompare * -1;
        }

        // Break tie with first name
        // Gunakan nama depan sebagai pemutus seri terakhir
        return this.firstName.compareTo(otherPerson.getFirstName()) * -1;
    }

    // -------------------------
    // First name accessor.
    // Mengambil nama depan.
    // -------------------------
    public String getFirstName() {
        return firstName;
    }

    // -------------------------
    // Last name accessor.
    // Mengambil nama belakang.
    // -------------------------
    public String getLastName() {
        return lastName;
    }

    // -------------------------
    // Total sales accessor.
    // Mengambil total penjualan.
    // -------------------------
    public int getSales() {
        return totalSales;
    }
}