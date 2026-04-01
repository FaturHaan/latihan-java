package JavaProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemTwo {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(101, "Joe"),
                new Student(103, "Zulkifli"),
                new Student(102, "Riza"),
                new Student(104, "Alice"),
                new Student(105, "Joshua")
        );

        List<Student> ans = students.stream() // [1] Membuka stream
                .sorted((s1, s2) -> {         // [2] Melakukan pengurutan
                    
                    // Logika: Jika nama sama, bandingkan ID
                    if (s1.getName().equalsIgnoreCase(s2.getName())) {
                        return Integer.compare(s1.getId(), s2.getId()); // [3] Membandingkan nilai ID dengan method Integer
                    } 
                    // Jika nama berbeda, bandingkan Nama
                    else {
                        return s1.getName().compareToIgnoreCase(s2.getName()); // [4] Membandingkan dua string mengabaikan huruf besar/kecil untuk nilai integer
                    }
                })
                .collect(Collectors.toList()); // [5] Mengumpulkan hasil

        for (Student student : ans) {
            System.out.println(student);
        }
    }
}

// Buatlah class Student disertai dengan attribute dan method lainnya yang diperlukan!
class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}
