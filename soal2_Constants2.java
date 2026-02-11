/**
 * Nama Program: soal2_Constants2
 * Tujuan Program: Mendemonstrasikan penggunaan konstanta tingkat kelas (static final) 
 * untuk mengonversi satuan inci ke sentimeter pada dimensi kertas.
 * * Input: 
 * - Tidak ada input eksternal (menggunakan nilai variabel yang sudah ditentukan: 8.5 dan 11).
 * * Output:
 * - Menampilkan teks ukuran kertas dalam sentimeter (21.59 by 27.94).
 */

public class soal2_Constants2 {
    public static final double CM_PER_INCH = 2.54; 
    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " 
        + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}