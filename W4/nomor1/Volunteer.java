package W4.nomor1;

//********************************************************************
// Volunteer.java Author: Lewis/Loftus
//
// Represents a volunteer staff member.
// Merepresentasikan anggota staf sukarela yang tidak dibayar.
//********************************************************************
public class Volunteer extends StaffMember {
    // -----------------------------------------------------------------
    // Sets up a volunteer using the specified information.
    // Konstruktor: Menginisialisasi sukarelawan dengan informasi
    // nama, alamat, dan nomor telepon.
    // -----------------------------------------------------------------
    public Volunteer(String eName, String eAddress, String ePhone) {
        super(eName, eAddress, ePhone);
    }

    // -----------------------------------------------------------------
    // Returns the pay for a volunteer (always 0).
    // Mengembalikan gaji sukarelawan yang selalu bernilai 0,
    // karena sukarelawan tidak menerima pembayaran.
    // -----------------------------------------------------------------
    public double pay() {
        return 0.0;
    }
}