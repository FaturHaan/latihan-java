import java.util.Scanner;

// Program penjumlahan paralel menggunakan Java Threads
public class jumlahParallel {

    // Array hasil parsial, satu slot per thread
    private static long[] hasilParsial;

    // Inner class tugas yang dijalankan tiap thread
    static class SumTask implements Runnable {

        private final int  idThread;
        private final long batas_awal;
        private final long batas_akhir;

        SumTask(int idThread, long batas_awal, long batas_akhir) {
            this.idThread    = idThread;
            this.batas_awal  = batas_awal;
            this.batas_akhir = batas_akhir;
        }

        @Override
        public void run() {
            System.out.printf("Thread %d Memulai penjumlahan dari %d sampai %d%n",
                    idThread, batas_awal, batas_akhir);

            // Variabel lokal, hanya milik thread ini (thread-safe)
            long jumlahLokal = 0;
            for (long i = batas_awal; i <= batas_akhir; i++) {
                jumlahLokal += i;
            }

            // Simpan ke slot eksklusif milik thread ini
            hasilParsial[idThread - 1] = jumlahLokal;

            System.out.printf("Thread %d Selesai. Hasil parsial (%d s.d. %d) = %,d%n",
                    idThread, batas_awal, batas_akhir, jumlahLokal);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Masukkan jumlah thread  : ");
        int jumlahThread = scanner.nextInt();

        System.out.print("Masukkan angka akhir    : ");
        long angkaAkhir = scanner.nextLong();
        scanner.close();

        // Validasi input
        if (jumlahThread <= 0 || angkaAkhir <= 0) {
            System.out.println("Input harus berupa bilangan positif!");
            return;
        }
        if (jumlahThread > angkaAkhir) {
            System.out.println("Jumlah thread tidak boleh melebihi angka akhir!");
            return;
        }

        System.out.println();
        System.out.printf ("Menjumlahkan 1 s.d. %,d menggunakan %d thread%n", angkaAkhir, jumlahThread);


        // Alokasi array hasil parsial
        hasilParsial = new long[jumlahThread];

        // Divide dan Conquer hitung ukuran tiap chunk dan sisa pembagian
        long ukuranChunk = angkaAkhir / jumlahThread;
        long sisa = angkaAkhir % jumlahThread;

        Thread[] threads = new Thread[jumlahThread];

        System.out.println("\nPEMBAGIAN TUGAS");

        for (int i = 0; i < jumlahThread; i++) {
            long batasAwal = (i * ukuranChunk) + 1;
            long batasAkhir = (i + 1) * ukuranChunk;

            // Thread terakhir mendapat sisa agar tidak ada angka yang terlewat
            if (i == jumlahThread - 1) {
                batasAkhir += sisa;
            }

            System.out.printf(" Thread %d: menjumlahkan %,d - %,d%n",
                    i + 1, batasAwal, batasAkhir);

            threads[i] = new Thread(new SumTask(i + 1, batasAwal, batasAkhir));
        }

        // Mulai semua thread secara paralel
        System.out.println("\nEKSEKUSI THREAD");
        for (int i = 0; i < jumlahThread; i++) {
            threads[i].start();
        }

        // Sinkronisasi, menunggu semua thread selesai sebelum membaca hasil
        for (int i = 0; i < jumlahThread; i++) {
            threads[i].join();
        }

        // Akumulasi total dari semua hasil parsial
        long totalAkhir = 0;
        for (long parsial : hasilParsial) {
            totalAkhir += parsial;
        }

        // Output hasil
        System.out.println();
        System.out.println("REKAP HASIL PARSIAL PER THREAD");
        for (int i = 0; i < jumlahThread; i++) {
            System.out.printf("Thread %d: hasil parsial = %,d%n",
                    i + 1, hasilParsial[i]);
        }

        System.out.println();
        System.out.printf ("TOTAL AKHIR (semua thread) = %,d%n", totalAkhir);
    }
}