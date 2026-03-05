package W4.nomor3;

//********************************************************************
// Sorting.java Author: Lewis/Loftus
//
// Demonstrates the selection sort and insertion sort algorithms.
// Mendemonstrasikan algoritma selection sort dan insertion sort.
//********************************************************************
public class Sorting {
    // -----------------------------------------------------------------
    // Sorts the specified array of objects using the selection
    // sort algorithm.
    // Mengurutkan array objek menggunakan algoritma selection sort.
    // Mencari elemen terkecil di setiap iterasi lalu menukarnya
    // ke posisi yang benar.
    // -----------------------------------------------------------------
    public static <T extends Comparable<T>> void selectionSort(T[] list) {
        int min; // indeks elemen terkecil yang ditemukan
        T temp; // variabel sementara untuk proses penukaran
        for (int index = 0; index < list.length - 1; index++) {
            min = index; // asumsikan elemen saat ini adalah yang terkecil
            // Cari elemen terkecil di sisa array
            for (int scan = index + 1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            // Swap the values
            // Tukar elemen terkecil ke posisi yang benar
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    // -----------------------------------------------------------------
    // Sorts the specified array of objects using the insertion
    // sort algorithm.
    // Mengurutkan array objek menggunakan algoritma insertion sort.
    // Setiap elemen disisipkan ke posisi yang tepat (urutan menurun).
    // -----------------------------------------------------------------
    public static <T extends Comparable<T>> void insertionSort(T[] list) {
        for (int index = 1; index < list.length; index++) {
            T key = list[index]; // elemen yang akan disisipkan ke posisi tepat
            int position = index;
            // Shift smaller values to the right (for descending order)
            // Geser elemen yang lebih kecil ke kanan untuk urutan menurun
            while (position > 0 && key.compareTo(list[position - 1]) > 0) {
                list[position] = list[position - 1];
                position--;
            }
            // Tempatkan elemen key di posisi yang sesuai
            list[position] = key;
        }
    }
}