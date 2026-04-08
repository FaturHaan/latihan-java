class Account {
    int balance = 150;
}

public class TransferFulus {
    public static void main(String[] args) throws InterruptedException {
        Account acc1 = new Account();
        Account acc2 = new Account();

        // Thread 1: Menjumlahkan/ transfer fulus dari acc1 ke acc2
        Thread t1 = new Thread(() -> {
            synchronized (acc1) { // Mengunci objek acc1 agar tidak bisa diakses thread lain selama proses
                System.out.println("Thread 1: Berhasil mengunci acc1, mencoba mengakses acc2...");
                try { 
                    Thread.sleep(100); 
                } catch (Exception e) {
                    // Exception diperlukan karena sleep() bisa diinterupsi oleh proses lain
                }

                synchronized (acc2) { // Mengunci objek acc2 untuk melakukan update saldo
                    System.out.println("Thread 1: Berhasil mengunci acc2, melakukan transfer.");
                    acc2.balance += acc1.balance;
                }
            }
        });

        // Thread 2: Menjumlahkan/ transfer fulus dari acc2 ke acc1
        Thread t2 = new Thread(() -> {
            synchronized (acc1) { // Mengunci acc1 terlebih dahulu untuk menghindari kondisi deadlock
                System.out.println("Thread 2: Berhasil mengunci acc1, mencoba mengakses acc2...");
                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (acc2) { // Mengunci acc2 untuk mengambil saldonya dan menambahkannya ke acc1
                    System.out.println("Thread 2: Berhasil mengunci acc2, melakukan transfer.");
                    acc1.balance += acc2.balance;
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("--- HASIL AKHIR ---");
        System.out.println("Saldo Akhir acc1: " + acc1.balance);
        System.out.println("Saldo Akhir acc2: " + acc2.balance);
    }
}