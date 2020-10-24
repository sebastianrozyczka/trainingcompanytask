public class OccupationalGroup {
    private Lecturer lecturer;
    private Student[] students;

    public OccupationalGroup(Lecturer lecturer, Student[] students) {
        this.lecturer = lecturer;
        this.students = students;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String infoAboutGroupsLecturer() {
        return "Grupa zajęciowa prowadzona przez prowadzącego: "
                + lecturer.getFirstName() + " " + lecturer.getLastName()
                + ", o stopniu naukowym: " + lecturer.getDegree();
    }

    public String infoAboutStudentWithIndex(int index) {
        return "Student o indeksie: " + (index + 1) + ", imię i nazwisko: " + students[index].getFirstName() + " " + students[index].getLastName();
    }
}
