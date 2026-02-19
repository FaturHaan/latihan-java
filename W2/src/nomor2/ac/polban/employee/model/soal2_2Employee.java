
//Nama Program   : soal2_2Employee
//Package        : nomor2.ac.polban.employee.model
//Input :
//- id (int)           
//- name (String)     
//- department (Department) 
//- type (EmployeeType)    
//- salary (double)    
// Output :
//- Data Employee melalui getter 
package nomor2.ac.polban.employee.model;

public class soal2_2Employee {
    private int id;
    private String name;
    
    //Aggregation
    private soal2_1Department department;
    private soal2_3EmployeeType type;

    private double salary;

    //Konstruktor untuk membuat objek employee baru
    public soal2_2Employee(int id, String name, soal2_1Department department, soal2_3EmployeeType type, double salary) {
        this.id = id;
        this.name = name;
        this.department = department; //Dependency
        this.type = type; //Dependency
        this.salary = salary;
    }
 
    //Getter dan setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public soal2_1Department getDepartment() {
        return department;
    }
    public void setDepartment(soal2_1Department department) {
        this.department = department;
    }
    public soal2_3EmployeeType getType() {
        return type;
    }
    public void setType(soal2_3EmployeeType type) {
        this.type = type;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

}
