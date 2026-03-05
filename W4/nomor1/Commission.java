package W4.nomor1;

//********************************************************************
// Commission.java
//
// Represents an employee that gets paid an hourly rate and
// a commission on sales.
// Merepresentasikan karyawan yang dibayar per jam
// ditambah komisi dari total penjualan.
//********************************************************************
public class Commission extends Hourly {
    private double totalSales; // total nilai penjualan yang terakumulasi
    private double commissionRate; // persentase komisi dari total penjualan

    // -----------------------------------------------------------------
    // Sets up this commission employee with the specified information.
    // Konstruktor: Menginisialisasi karyawan komisi dengan informasi
    // yang diberikan. Total penjualan awal diset ke nol.
    // -----------------------------------------------------------------
    public Commission(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate, double commRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = commRate;
        totalSales = 0; // belum ada penjualan saat pertama dibuat
    }

    // -----------------------------------------------------------------
    // Adds the specified sales to this employee's accumulated sales.
    // Menambahkan nilai penjualan ke total penjualan karyawan ini.
    // -----------------------------------------------------------------
    public void addSales(double additionalSales) {
        totalSales += additionalSales;
    }

    // -----------------------------------------------------------------
    // Computes and returns the pay for this commission employee.
    // Menghitung dan mengembalikan gaji karyawan komisi
    // (gaji per jam + komisi dari total penjualan).
    // Total penjualan direset ke nol setelah pembayaran.
    // -----------------------------------------------------------------
    public double pay() {
        double payment = super.pay() + (totalSales * commissionRate);
        totalSales = 0; // reset total penjualan setelah pembayaran
        return payment;
    }

    // -----------------------------------------------------------------
    // Returns information about this commission employee as a string.
    // Mengembalikan String berisi informasi karyawan komisi,
    // termasuk total penjualan yang terakumulasi.
    // -----------------------------------------------------------------
    public String toString() {
        String result = super.toString();
        result += "\nTotal sales: $" + totalSales;
        return result;
    }
}
