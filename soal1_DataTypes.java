/**
 * Nama Program: soal1_DataTypes
 * Tujuan Program: Menentukan tipe data primitif Java (byte, short, int, long) 
 * yang mampu menampung nilai input bilangan bulat tertentu.
 * * Input: 
 * - Baris pertama: Integer 't' yang menyatakan jumlah test case.
 * - Baris berikutnya: String berisi angka yang ingin dicek kapasitasnya.
 * * Output:
 * - Menampilkan daftar tipe data yang muat untuk angka tersebut.
 * - Menampilkan pesan jika angka tidak muat di tipe data manapun (melebihi kapasitas long).
 */

import java.util.*;

public class soal1_DataTypes {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            if (!sc.hasNextInt()) {
                return;
            }
            
            int t = sc.nextInt();

            for (int i = 0; i < t; i++) {
                String input = sc.next();
                try {

                    long n = Long.parseLong(input);
                    
                    System.out.println(input + " can be fitted in:");
                    
                    if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                        System.out.println("* byte");
                    }
                    if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                        System.out.println("* short");
                    }
                    if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                        System.out.println("* int");
                    }
                    if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                        System.out.println("* long");
                    }
                    
                } catch (NumberFormatException e) {
                    System.out.println(input + " can't be fitted anywhere.");
                }
            }
        } catch (Exception e) {
        }
    }
}