//Nama Program   : soal1Restaurant
//Package        : nomor1
//Input :
//- Nama makanan (String)
//- Harga makanan (double)
//- Stok awal makanan (int)
//- Index menu dan jumlah pesanan (int)
//Output :
//- Informasi menu yang tersedia dan harga
//- Pemberitahuan jika stok habis atau menu tidak ditemukan
//- Konfirmasi keberhasilan atau penolakan pesanan
//- Sisa stok setelah pemesanan
package nomor1;

public class soal1Restaurant {

    //Semua atribut dibuat private
    private String[] namaMakanan;
    private double[] hargaMakanan;
    private int[] stok;
    private static byte id = 0;

    public soal1Restaurant() {
        namaMakanan = new String[10];
        hargaMakanan = new double[10];
        stok = new int[10];
    }

    //Getter
    public String getNamaMakanan(int index) {
        return namaMakanan[index];
    }

    public double getHargaMakanan(int index) {
        return hargaMakanan[index];
    }

    public int getStok(int index) {
        return stok[index];
    }

    //Setter dengan validasi stok
    public void setStok(int index, int stokBaru) {
        if (stokBaru >= 0) {
            stok[index] = stokBaru;
        } else {
            System.out.println("Stok tidak boleh negatif!");
        }
    }

    //Tambah Menu
    public void tambahMenuMakanan(String nama, double harga, int stokBaru) {
        if (stokBaru < 0) {
            System.out.println("Gagal menambahkan menu. Stok tidak boleh negatif.");
            return;
        }

        namaMakanan[id] = nama;
        hargaMakanan[id] = harga;
        stok[id] = stokBaru;
        id++;
    }

    //Tampilkan Menu
    public void tampilMenuMakanan() {
        for (int i = 0; i < id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(
                    i + ". " + namaMakanan[i] +
                    " [" + stok[i] + "]" +
                    "\tRp. " + hargaMakanan[i]
                );
            }
        }
    }

    //Cek stok habis
    private boolean isOutOfStock(int index) {
        return stok[index] == 0;
    }

    
    //Fitur pesan menu
    public void pesanMenu(int index, int jumlah) {

        if (index >= id || index < 0) {
            System.out.println("Menu tidak ditemukan!");
            return;
        }

        if (jumlah <= 0) {
            System.out.println("Jumlah pesanan tidak valid!");
            return;
        }

        if (stok[index] >= jumlah) {
            stok[index] -= jumlah;
            System.out.println("Pesanan berhasil!");
            System.out.println("Sisa stok: " + stok[index]);
        } else {
            System.out.println("Pesanan ditolak! Stok tidak mencukupi.");
        }
    }
}
