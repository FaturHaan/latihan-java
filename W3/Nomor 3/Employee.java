class Employee extends Sortable {
    
    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;

    // Constructor untuk menginisialisasi data karyawan saat objek dibuat
    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }

    // Method untuk menampilkan informasi dasar karyawan
    public void print() {
        System.out.println(name + " " + salary + " " + hireYear());
    }

    // Method untuk menaikkan gaji berdasarkan persentase tertentu
    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    // Getter untuk mengambil tahun masuk kerja
    public int hireYear() {
        return hireyear;
    }

    // Implementasi method abstract dari class Sortable
    @Override
    public int compare(Sortable b) {
        // Casting dari Sortable ke Employee
        Employee eb = (Employee) b;
        if (salary < eb.salary) return -1;
        if (salary > eb.salary) return 1;
        return 0;
    }

}

