package JavaProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemOne {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee("John", 50000));
        list.add(new Employee("Rob", 70000));
        list.add(new Employee("Bob", 40000));
        list.add(new Employee("Alice", 10000));

        // Melakukan proses filtering/sorting menggunakan Stream API
        List<Employee> sortedEmp = list.stream() // [1] Ubah list ke stream
                // Mengurutkan employee berdasarkan nama
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName())) // [2] Gunakan method sort (operasi intermediate) yang menerima ekspresi lambda, [3] Panggil method getter yang sesuai
                // Mengumpulkan hasil akhir
                .collect( Collectors.toList() ); // [4] Gunakan operasi terminal untuk mengubah stream data kembali menjadi objek List, [5] Gunakan utilitas class dan method yang sesuai

        for(Employee e : sortedEmp){
            System.out.println(e);
        }
    }
}

// Buatlah class Employee disertai dengan getter getName() dan getSalary(), termasuk attribute dan method lainnya jika diperlukan!

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}
