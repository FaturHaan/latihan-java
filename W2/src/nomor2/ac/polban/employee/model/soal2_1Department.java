//Nama Program   : soal2_1Department
//Package        : nomor2.ac.polban.employee.model
//Input :
//- Nama department (String) 
//Output: 
//- Nama department (String) lewat getter

package nomor2.ac.polban.employee.model;

public class soal2_1Department {
    private String name;

    public soal2_1Department(String name) {
        this.name = name;
    }

    //Getter untuk mengambil nama department
    public String getName() {
        return name;
    }

    //Setter untuk mengubah nama department
    public void setName(String name) {
        this.name = name;
    }
}
