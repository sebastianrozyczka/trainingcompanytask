import java.util.ArrayList;

public class GroupBuilder {
    public OccupationalGroup createOccupationalGroup(Lecturer lecturer, ArrayList<Student> students, int number) {
        return new OccupationalGroup(lecturer, students, number);
    }

    public Lecturer createLecturer(String firstName, String lastName, int age, double salary, String degree) {
        return new Lecturer(firstName, lastName, age, salary, degree);
    }

    public ArrayList<Student> createStudentList() {
        return new ArrayList<>();
    }

    public ArrayList<Grade> createGradeList() { return new ArrayList<>(); }
}
