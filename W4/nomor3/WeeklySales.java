
package W4.nomor3;

// *************************************************************
// WeeklySales.java
//
// Sorts the sales staff in descending order by sales.
// Mengurutkan staf penjualan secara menurun berdasarkan penjualan.
// ************************************************************
import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah tenaga penjual
        System.out.print("Enter number of salespeople: ");
        int size = scan.nextInt();

        // Membuat array untuk menyimpan data tenaga penjual
        Salesperson[] salesStaff = new Salesperson[size];

        // Membaca data setiap tenaga penjual dari pengguna
        System.out.println("\nEnter the information for the salespeople:");
        for (int i = 0; i < size; i++) {
            System.out.print("\nSalesperson " + (i + 1) + " first name: ");
            String first = scan.next();
            System.out.print("Salesperson " + (i + 1) + " last name: ");
            String last = scan.next();
            System.out.print("Salesperson " + (i + 1) + " total sales: ");
            int sales = scan.nextInt();

            // Membuat objek Salesperson dan menyimpannya ke array
            salesStaff[i] = new Salesperson(first, last, sales);
        }

        // Mengurutkan array tenaga penjual menggunakan insertion sort (urutan menurun)
        Sorting.insertionSort(salesStaff);

        // Menampilkan peringkat penjualan mingguan
        System.out.println("\nRanking of Sales for the Week\n");
        for (Salesperson s : salesStaff)
            System.out.println(s);

        // Menutup Scanner untuk menghindari resource leak
        scan.close();
    }
}