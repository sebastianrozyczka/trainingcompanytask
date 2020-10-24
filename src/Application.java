public class Application {
    public static void main(String[] args) {
        GroupCreator groupCreator = new GroupCreator();

        Lecturer lecturer = groupCreator.createLecturer("Andrzej", "Kowalski", 38, 7329.4, "inżynier");
        Student[] studentTable = groupCreator.createEmptyStudentTable(3);
        groupCreator.putStudentIntoTable(studentTable, 0, "Jan", "Kowalski", 21, 2, "średnie");
        groupCreator.putStudentIntoTable(studentTable, 1, "Sebastian", "Różyczka", 23, 5, "w trakcie studiów");
        groupCreator.putStudentIntoTable(studentTable, 2, "Artur", "Lewandowski", 31, 4, "inżynier");
        OccupationalGroup occupationalGroup = groupCreator.createOccupationalGroup(lecturer, studentTable);

        System.out.println(occupationalGroup.infoAboutGroupsLecturer());
        System.out.println(occupationalGroup.infoAboutStudentWithIndex(0));
        System.out.println(occupationalGroup.infoAboutStudentWithIndex(1));
        System.out.println(occupationalGroup.infoAboutStudentWithIndex(2));
    }
}
