package W4.nomor3;

// ******************************************************
// Numbers.java
//
// Demonstrates selectionSort on an array of integers.
// Mendemonstrasikan selectionSort pada array bilangan bulat.
// ******************************************************
import java.util.Scanner;

public class Numbers {
    // --------------------------------------------
    // Reads in an array of integers, sorts them,
    // then prints them in sorted order.
    // Membaca array bilangan bulat, mengurutkannya,
    // lalu mencetak hasilnya dalam urutan terurut.
    // --------------------------------------------
    public static void main(String[] args) {
        Integer[] intList; // array untuk menyimpan bilangan bulat
        int size; // jumlah bilangan yang akan diurutkan
        Scanner scan = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah bilangan
        System.out.print("\nHow many integers do you want to sort? ");
        size = scan.nextInt();

        // Membuat array sesuai ukuran yang dimasukkan
        intList = new Integer[size];

        // Membaca bilangan satu per satu dari pengguna
        System.out.println("\nEnter the numbers...");
        for (int i = 0; i < size; i++)
            intList[i] = scan.nextInt();

        // Mengurutkan array menggunakan insertion sort
        Sorting.insertionSort(intList);

        // Menampilkan hasil pengurutan
        System.out.println("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(intList[i] + " ");
        System.out.println();

        // Menutup Scanner untuk menghindari resource leak
        scan.close();
    }
}
