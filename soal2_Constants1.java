/**
 * Nama Program: soal2_Constants1
 * Tujuan Program: Menghitung dan menampilkan dimensi kertas dari satuan inci ke sentimeter
 * menggunakan konstanta lokal (final).
 * * * Input: 
 * - Tidak ada input dari pengguna (nilai hardcoded: paperWidth = 8.5, paperHeight = 11).
 * * * Output:
 * - Menampilkan ukuran kertas dalam sentimeter hasil konversi (Lebar x Tinggi).
 */

public class soal2_Constants1 {
    public static void main(String[] args) { 
        final double CM_PER_INCH = 2.54; 
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: "
        + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}