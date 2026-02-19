//Nama Program   : soal2_4EmployeeService
//Package        : nomor2.ac.polban.employee.service
//Input :
//- Objek Employee (soal2_2Employee)
//- id Employee (int)
//- Persentase kenaikan gaji (double)
//Output :
//- Data Employee berdasarkan ID
//- Konfirmasi kenaikan gaji
//- Total jumlah Employee
package nomor2.ac.polban.employee.service;

import java.util.HashMap;
import java.util.Map;
import nomor2.ac.polban.employee.model.*;


//Mengelola operasi yang berkaitan dengan data dan aturan bisnis 

public class soal2_4EmployeeService {
    private Map<Integer, soal2_2Employee> employees = new HashMap<>();

    //Menyimpan jumlah total employee secara global
    private static int totalEmployees = 0;

    //Menambahkan employee
    public void addEmployee(soal2_2Employee emp) {
        employees.put(emp.getId(), emp);
        
        //Update totalEmployees setiap kali menambah employee
        totalEmployees++;
    }

    //Mengambil employee berdasarkan id
    public soal2_2Employee getEmployee(int id) {
        return employees.get(id);
    }

    //Mengubah gaji employee
    public void raiseSalary(int id, double percent) {
        soal2_2Employee emp = employees.get(id);
        if (emp != null) {
            emp.setSalary(emp.getSalary() * (1 + percent/100));
        }
    }

    //Menampilkan jumlah total employee
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}
