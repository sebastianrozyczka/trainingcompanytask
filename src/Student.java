public class Student extends Person {
    private int semester;
    private String education;

    public Student(String firstName, String lastName, int age, int semester, String course) {
        super(firstName, lastName, age);
        this.semester = semester;
        this.education = course;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
