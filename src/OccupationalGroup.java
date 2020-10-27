import java.util.ArrayList;

public class OccupationalGroup {
    private Lecturer lecturer;
    private ArrayList<Student> students;
    private int number;

    public OccupationalGroup(Lecturer lecturer, ArrayList<Student> students, int number) {
        this.lecturer = lecturer;
        this.students = students;
        this.number = number;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String infoAboutGroupsLecturer() {
        return "Grupa zajęciowa prowadzona przez prowadzącego: "
                + lecturer.getFirstName() + " " + lecturer.getLastName()
                + ", o stopniu naukowym: " + lecturer.getDegree();
    }

    public String infoAboutStudentWithIndex(int index) {
        return "Student o indeksie: " + (index + 1) + ", imię i nazwisko: " + students.get(index).getFirstName() + " " + students.get(index).getLastName();
    }

    public void addStudent(String firstName, String lastName, int age, int semester, String education, ArrayList<Grade> grades) {
        students.add(new Student(firstName, lastName, age, semester, education, grades));
    }
}
