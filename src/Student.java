public class Student extends Person {
    private int semester;
    private String education;
    private double grade;

    public Student(String firstName, String lastName, int age, int semester, String education) {
        super(firstName, lastName, age);
        this.semester = semester;
        this.education = education;
    }

    public Student(double grade) {
        this.grade = grade;
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
