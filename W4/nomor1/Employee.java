package W4.nomor1;

//********************************************************************
// Employee.java Author: Lewis/Loftus
//
// Represents a general paid employee.
// Merepresentasikan karyawan berbayar secara umum.
//********************************************************************
public class Employee extends StaffMember {
    protected String socialSecurityNumber; // nomor jaminan sosial karyawan
    protected double payRate; // tarif gaji karyawan

    // -----------------------------------------------------------------
    // Sets up an employee with the specified information.
    // Konstruktor: Menginisialisasi karyawan dengan informasi
    // pribadi dan tarif gaji yang diberikan.
    // -----------------------------------------------------------------
    public Employee(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate) {
        super(eName, eAddress, ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    // -----------------------------------------------------------------
    // Returns information about an employee as a string.
    // Mengembalikan String berisi informasi lengkap karyawan,
    // termasuk nomor jaminan sosial.
    // -----------------------------------------------------------------
    public String toString() {
        String result = super.toString();
        result += "\nSocial Security Number: " + socialSecurityNumber;
        return result;
    }

    // -----------------------------------------------------------------
    // Returns the pay rate for this employee.
    // Mengembalikan tarif gaji karyawan ini.
    // -----------------------------------------------------------------
    public double pay() {
        return payRate;
    }
}