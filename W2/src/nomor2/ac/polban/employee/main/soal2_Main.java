//Nama Program   : soal2_Main
//Package        : nomor2

//Output :
//- Total jumlah employee
//- Detail setiap employee (ID, Name, Department, Type, Salary)
//- Konfirmasi kenaikan gaji dan gaji terbaru setelah kenaikan
package nomor2.ac.polban.employee.main;

import nomor2.ac.polban.employee.model.*;
import nomor2.ac.polban.employee.service.soal2_4EmployeeService;

public class soal2_Main {
    public static void main(String[] args) {
        //Membuat Department
        soal2_1Department itDept = new soal2_1Department("IT");
        soal2_1Department hrDept = new soal2_1Department("HR");

        //Membuat Employee Type
        soal2_3EmployeeType fullTime = new soal2_3EmployeeType("Full Time");
        soal2_3EmployeeType partTime = new soal2_3EmployeeType("Part Time");

        //Membuat Employee
        soal2_2Employee emp1 = new soal2_2Employee(1, "Alice", itDept, fullTime, 5000);
        soal2_2Employee emp2 = new soal2_2Employee(2, "Bob", hrDept, partTime, 3000);
        soal2_2Employee emp3 = new soal2_2Employee(3, "Charlie", itDept, partTime, 3500);

        //Menggunakan Employee Service
        soal2_4EmployeeService empService = new soal2_4EmployeeService();
        empService.addEmployee(emp1);
        empService.addEmployee(emp2);
        empService.addEmployee(emp3);

        //Menampilkan Total Employee
        soal2_4EmployeeService.displayTotalEmployees();

        //Menampilkan Informasi Employee
        System.out.println("Employee Details:");
        for (int id = 1; id <= 3; id++) {
            soal2_2Employee emp = empService.getEmployee(id);
            if (emp != null) {
                System.out.println("ID: " + emp.getId());
                System.out.println("Name: " + emp.getName());
                System.out.println("Department: " + emp.getDepartment().getName());
                System.out.println("Type: " + emp.getType().getType());
                System.out.println("Salary: $" + emp.getSalary());
                System.out.println("------------------------");
            }
        }

        //Mengubah Gaji Employee
        System.out.println("Raise salary for Employee 1 by 10%");
        empService.raiseSalary(1, 10);

        //Menampilkan gaji setelah kenaikan
        soal2_2Employee empUpdated = empService.getEmployee(1);
        System.out.println("Updated Salary of " + empUpdated.getName() + ": $" + empUpdated.getSalary());
    }
}

