import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        GroupBuilder groupBuilder = new GroupBuilder();

        ArrayList<Grade> gradesInFirstGroup = groupBuilder.createGradeList();
        ArrayList<Grade> gradesInSecondGroup = groupBuilder.createGradeList();
        ArrayList<Student> studentsInFirstGroup = groupBuilder.createStudentList();
        ArrayList<Student> studentsInSecondGroup = groupBuilder.createStudentList();
        Lecturer lecturer = new Lecturer("Jan", "Kowalski", 43, 2900, "doktor");

        ArrayList<OccupationalGroup> occupationalGroups = new ArrayList<>();
        occupationalGroups.add(new OccupationalGroup(lecturer, studentsInFirstGroup, 1));
        occupationalGroups.add(new OccupationalGroup(lecturer, studentsInSecondGroup, 2));
        occupationalGroups.get(0).addStudent("Sebastian", "Rozyczka", 23, 4, "w trakcie studiów", gradesInFirstGroup);
        occupationalGroups.get(1).addStudent("Sebastian", "Rozyczka", 23, 4, "w trakcie studiów", gradesInSecondGroup);

        studentsInFirstGroup.get(0).addGrade(0, 4, occupationalGroups.get(0));
        studentsInFirstGroup.get(0).addGrade(1, 3, occupationalGroups.get(0));
        studentsInFirstGroup.get(0).addGrade(2, 5, occupationalGroups.get(0));
        studentsInFirstGroup.get(0).showInfoAboutGrades(occupationalGroups.get(0));

        studentsInSecondGroup.get(0).addGrade(0, 3, occupationalGroups.get(1));
        studentsInSecondGroup.get(0).addGrade(1, 2, occupationalGroups.get(1));
        studentsInSecondGroup.get(0).addGrade(2, 5, occupationalGroups.get(1));
        studentsInSecondGroup.get(0).showInfoAboutGrades(occupationalGroups.get(1));
    }
}
