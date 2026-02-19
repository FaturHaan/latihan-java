//Nama Program   : soal1RestaurantMain
//Package        : nomor1

//Output :
//- Daftar menu beserta harga dan stok sebelum pemesanan
//- Konfirmasi pemesanan sukses atau gagal
//- Daftar menu beserta stok setelah pesan

package nomor1;

public class soal1RestaurantMain {

    public static void main(String[] args) {

        soal1Restaurant menu = new soal1Restaurant();

        menu.tambahMenuMakanan("Pizza", 250000, 20); //Tambah menu Pizza
        menu.tambahMenuMakanan("Spaghetti", 80000, 20); //Tambah menu Spaghetti
        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30); //Tambah menu Tenderloin Steak
        menu.tambahMenuMakanan("Chicken Steak", 45000, 30); //Tambah menu Chicken Steak

        System.out.println("=== DAFTAR MENU ===");
        menu.tampilMenuMakanan();

        System.out.println("\nPesanan 1 : index = 0, jumlah = 5");
        System.out.println("Pesanan 2 : index = 1, jumlah = 50");
        System.out.println("\n=== PESAN MENU ===");
        menu.pesanMenu(0, 5);  //Pesan 5 Pizza
        menu.pesanMenu(1, 50); //Gagal karena stok kurang

        System.out.println("\n=== MENU SETELAH PEMESANAN ===");
        menu.tampilMenuMakanan();
    }
}
