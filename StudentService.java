import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    public Student getStudentById(int id) {
        for(Student s : students) {
            if(s.getId() == id)
                return s;
        }
        return null;
    }
}
