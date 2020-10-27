import java.util.ArrayList;

public class Student extends Person {
    private int semester;
    private String education;
    private ArrayList<Grade> grades;

    public Student(String firstName, String lastName, int age, int semester, String education, ArrayList<Grade> grades) {
        super(firstName, lastName, age);
        this.semester = semester;
        this.education = education;
        this.grades = grades;
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

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    public void addGrade(int index, int value, OccupationalGroup occupationalGroup) {
        grades.add(new Grade(value, occupationalGroup));
    }

    public void showInfoAboutGrades(OccupationalGroup occupationalGroup) {
        System.out.println("Oceny ucznia " + getFirstName() + " " + getLastName() + " w grupie " + occupationalGroup.getNumber() + " to: ");
        for (Grade grade : grades) {
            System.out.println(grade.getValue());
        }
    }
}
