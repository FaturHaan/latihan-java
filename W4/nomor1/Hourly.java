package W4.nomor1;

//********************************************************************
// Hourly.java Author: Lewis/Loftus
//
// Represents an employee that gets paid by the hour.
// Merepresentasikan karyawan yang dibayar berdasarkan jam kerja.
//********************************************************************
public class Hourly extends Employee {
    private int hoursWorked; // jumlah jam kerja yang telah terakumulasi

    // -----------------------------------------------------------------
    // Sets up this hourly employee using the specified information.
    // Konstruktor: Menginisialisasi karyawan per jam dengan informasi
    // yang diberikan. Jam kerja awal diset ke nol.
    // -----------------------------------------------------------------
    public Hourly(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        hoursWorked = 0; // belum ada jam kerja saat pertama dibuat
    }

    // -----------------------------------------------------------------
    // Adds the specified number of hours to this employee's
    // accumulated hours.
    // Menambahkan jumlah jam kerja ke total jam kerja karyawan ini.
    // -----------------------------------------------------------------
    public void addHours(int moreHours) {
        hoursWorked += moreHours;
    }

    // -----------------------------------------------------------------
    // Computes and returns the pay for this hourly employee.
    // Menghitung dan mengembalikan gaji karyawan per jam
    // (tarif × jam kerja). Jam kerja direset ke nol setelah dibayar.
    // -----------------------------------------------------------------
    public double pay() {
        double payment = payRate * hoursWorked;
        hoursWorked = 0; // reset jam kerja setelah pembayaran
        return payment;
    }

    // -----------------------------------------------------------------
    // Returns information about this hourly employee as a string.
    // Mengembalikan String berisi informasi karyawan per jam,
    // termasuk jumlah jam kerja saat ini.
    // -----------------------------------------------------------------
    public String toString() {
        String result = super.toString();
        result += "\nCurrent hours: " + hoursWorked;
        return result;
    }
}