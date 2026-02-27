public class EmployeeTest {
    public static void main(String[] args) {
        // Mendeklarasikan dan mengalokasikan array untuk 3 objek Employee
        Employee[] staff = new Employee[3];

        // Inisialisasi data karyawan
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        // Menaikkan gaji setiap staf sebesar 5%
        for (int i = 0; i < 3; i++) {
            staff[i].raiseSalary(5);
        }

        // Mencetak data dari setiap staf
        for (int i = 0; i < 3; i++) {
            staff[i].print();
        }

        // Menguji method compare
        int hasil = staff[0].compare(staff[1]);

        if (hasil < 0) {
            System.out.println("Staff[0] memiliki gaji lebih kecil dari Staff[1]");
        } else if (hasil > 0) {
            System.out.println("Staff[0] memiliki gaji lebih besar dari Staff[1]");
        } else {
            System.out.println("Gaji keduanya sama");
        }
    }
}
