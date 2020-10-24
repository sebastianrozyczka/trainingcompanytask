public class Application {
    public static void main(String[] args) {
        GroupCreator groupCreator = new GroupCreator();

        Lecturer lecturer = groupCreator.createLecturer("Andrzej", "Kowalski", 38, 7329.4, "inżynier");
        Student[] studentTable = groupCreator.createEmptyStudentTable(3);

        OccupationalGroup occupationalGroup = groupCreator.createOccupationalGroup(lecturer, studentTable);
        occupationalGroup.addStudent(0, "Sebastian", "Rozyczka", 23, 5, "w trakcie studiów");
        occupationalGroup.addStudent(1, "Jan", "Nowak", 23, 5, "w trakcie studiów");
        occupationalGroup.addStudent(2, "Kacper", "Lewandowski", 23, 5, "w trakcie studiów");

        System.out.println(occupationalGroup.infoAboutGroupsLecturer());
        System.out.println(occupationalGroup.infoAboutStudentWithIndex(0));
        System.out.println(occupationalGroup.infoAboutStudentWithIndex(1));
        System.out.println(occupationalGroup.infoAboutStudentWithIndex(2));
    }
}
