/**
 * Nama Program: soal3_Arithmetic
 * Tujuan Program: Mendemonstrasikan penggunaan metode Math.round() untuk membulatkan 
 * bilangan floating-point (double) ke bilangan bulat terdekat dan menyimpannya ke dalam tipe data int.
 * * * Input: 
 * - Nilai double x = 92.98 (Hardcoded).
 * * * Output:
 * - Menampilkan hasil pembulatan (nx) dalam bentuk integer.
 */

class soal3_Arithmetic {
    public static void main(String[] args) {
        double x = 92.98;
        int nx = (int) Math.round(x);
        
        System.out.println("Nilai nx: " + nx);
    }
}

