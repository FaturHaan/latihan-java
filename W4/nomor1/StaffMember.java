package W4.nomor1;

//********************************************************************
// StaffMember.java Author: Lewis/Loftus
//
// Represents a generic staff member.
// Merepresentasikan anggota staf secara umum (kelas abstrak dasar).
//********************************************************************
abstract public class StaffMember {
    protected String name; // nama anggota staf
    protected String address; // alamat anggota staf
    protected String phone; // nomor telepon anggota staf

    // -----------------------------------------------------------------
    // Sets up a staff member using the specified information.
    // Konstruktor: Menginisialisasi anggota staf dengan informasi
    // nama, alamat, dan nomor telepon.
    // -----------------------------------------------------------------
    public StaffMember(String eName, String eAddress, String ePhone) {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    // -----------------------------------------------------------------
    // Returns a string including the basic employee information.
    // Mengembalikan String berisi informasi dasar anggota staf.
    // -----------------------------------------------------------------
    public String toString() {
        String result = "Name: " + name + "\n";
        result += "Address: " + address + "\n";
        result += "Phone: " + phone;
        return result;
    }

    // -----------------------------------------------------------------
    // Derived classes must define the pay method for each type of
    // employee.
    // Kelas turunan wajib mendefinisikan metode pay() sesuai
    // jenis pekerjaan masing-masing (polimorfisme).
    // -----------------------------------------------------------------
    public abstract double pay();
}