public class Application {
    public static void main(String[] args) {
        GroupCreator groupCreator = new GroupCreator();

        Lecturer lecturer = groupCreator.createLecturer("Andrzej", "Kowalski", 38, 7329.4, "inżynier");
        Student[] studentTableForFirstGroup = groupCreator.createEmptyStudentTable(1);
        Student[] studentTableForSecondGroup = groupCreator.createEmptyStudentTable(1);

        OccupationalGroup[] occupationalGroups = new OccupationalGroup[2];
        occupationalGroups[0] = groupCreator.createOccupationalGroup(lecturer, studentTableForFirstGroup);
        occupationalGroups[1] = groupCreator.createOccupationalGroup(lecturer, studentTableForSecondGroup);
        occupationalGroups[0].addStudent(0, "Sebastian", "Rozyczka", 23, 5, "w trakcie studiów");
        occupationalGroups[1].addStudent(0, "Sebastian", "Rozyczka", 23, 5, "w trakcie studiów");


        occupationalGroups[0].giveStudentGrade(0, 5);
        occupationalGroups[1].giveStudentGrade(0, 3);

        System.out.println(occupationalGroups[0].infoAboutGroupsLecturer());
        System.out.println(occupationalGroups[0].infoAboutStudentWithIndex(0));
        System.out.println(occupationalGroups[0].infoAboutStudentGrades(0));

        System.out.println(occupationalGroups[1].infoAboutGroupsLecturer());
        System.out.println(occupationalGroups[1].infoAboutStudentWithIndex(0));
        System.out.println(occupationalGroups[1].infoAboutStudentGrades(0));
    }
}
