public class GroupCreator {
    public OccupationalGroup createOccupationalGroup(Lecturer lecturer, Student[] students) {
        return new OccupationalGroup(lecturer, students);
    }

    public Lecturer createLecturer(String firstName, String lastName, int age, double salary, String degree) {
        return new Lecturer(firstName, lastName, age, salary, degree);
    }

    public Student[] createEmptyStudentTable(int studentsQuantity) {
        return new Student[studentsQuantity];
    }

    private Student createStudent(String firstName, String lastName, int age, int semester, String education) {
        return new Student(firstName, lastName, age, semester, education);
    }

    public void putStudentIntoTable(Student[] students, int index,
                                    String firstName, String lastName, int age, int semester, String education) {
        students[index] = createStudent(firstName, lastName, age, semester, education);
    }
}
