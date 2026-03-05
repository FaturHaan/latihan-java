package W4.nomor1;

//********************************************************************
// Executive.java Author: Lewis/Loftus
//
// Represents an executive staff member, who can earn a bonus.
// Merepresentasikan karyawan eksekutif yang dapat menerima bonus.
//********************************************************************
public class Executive extends Employee {
    private double bonus; // jumlah bonus yang akan diterima eksekutif

    // -----------------------------------------------------------------
    // Sets up an executive with the specified information.
    // Konstruktor: Menginisialisasi eksekutif dengan informasi yang
    // diberikan. Bonus awal diset ke nol.
    // -----------------------------------------------------------------
    public Executive(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        bonus = 0; // bonus has yet to be awarded
        // bonus belum diberikan saat pertama kali dibuat
    }

    // -----------------------------------------------------------------
    // Awards the specified bonus to this executive.
    // Memberikan bonus sejumlah nilai yang ditentukan kepada eksekutif.
    // -----------------------------------------------------------------
    public void awardBonus(double execBonus) {
        bonus = execBonus;
    }

    // -----------------------------------------------------------------
    // Computes and returns the pay for an executive, which is the
    // regular employee payment plus a one-time bonus.
    // Menghitung dan mengembalikan pembayaran untuk eksekutif,
    // yaitu gaji reguler ditambah bonus satu kali. Bonus direset ke
    // nol setelah pembayaran dilakukan.
    // -----------------------------------------------------------------
    public double pay() {
        double payment = super.pay() + bonus;
        bonus = 0; // reset bonus setelah dibayarkan
        return payment;
    }
}