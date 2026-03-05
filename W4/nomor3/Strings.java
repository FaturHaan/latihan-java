package W4.nomor3;

// ******************************************************
// Strings.java
//
// Demonstrates insertionSort on an array of Strings.
// Mendemonstrasikan insertionSort pada array String.
// ******************************************************
import java.util.Scanner;

public class Strings {
    // --------------------------------------------
    // Reads in an array of Strings, sorts them,
    // then prints them in sorted order.
    // Membaca array String, mengurutkannya,
    // lalu mencetak hasilnya dalam urutan terurut.
    // --------------------------------------------
    public static void main(String[] args) {
        String[] stringList; // array untuk menyimpan kata-kata
        int size; // jumlah string yang akan diurutkan

        Scanner scan = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah string
        System.out.print("\nHow many strings do you want to sort? ");
        size = scan.nextInt();

        // Membuat array sesuai ukuran yang dimasukkan
        stringList = new String[size];

        // Membaca string satu per satu dari pengguna
        System.out.println("\nEnter the strings...");
        for (int i = 0; i < size; i++)
            stringList[i] = scan.next();

        // Mengurutkan array string menggunakan insertion sort
        Sorting.insertionSort(stringList);

        // Menampilkan hasil pengurutan
        System.out.println("\nYour strings in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(stringList[i] + " ");
        System.out.println();

        // Menutup Scanner untuk menghindari resource leak
        scan.close();
    }
}
