/**
 * Nama Program: soal5_OperatorChallenge
 * Tujuan Program: Mendemonstrasikan cara kerja operator unary (increment), 
 * operator relasional, dan operator logika (short-circuit AND).
 * * * Input: 
 * - Variabel int a = 5 dan int b = 10.
 * * * Output:
 * - Menampilkan hasil akhir evaluasi boolean.
 * - Menampilkan nilai akhir variabel a dan b setelah operasi dilakukan.
 */

class soal5_OperatorChallenge {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        boolean result = (++a * 2 > b) && (b++ % 3 == 1);

        System.out.println("Hasil Boolean: " + result);
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
    }
}

