package W4.nomor1;

//********************************************************************
// Firm.java Author: Lewis/Loftus
//
// Demonstrates polymorphism via inheritance.
// Mendemonstrasikan konsep polimorfisme melalui pewarisan (inheritance).
//********************************************************************
public class Firm {
    // -----------------------------------------------------------------
    // Creates a staff of employees for a firm and pays them.
    // Membuat daftar staf karyawan perusahaan dan menjalankan
    // proses pembayaran gaji (payday).
    // -----------------------------------------------------------------
    public static void main(String[] args) {
        // Membuat objek Staff yang berisi semua anggota staf
        Staff personnel = new Staff();

        // Membayar semua staf (menggunakan polimorfisme)
        personnel.payday();
    }
}