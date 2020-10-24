public class Lecturer extends Person {
    private double salary;
    private String degree;

    public Lecturer(String firstName, String lastName, int age, double salary, String degree) {
        super(firstName, lastName, age);
        this.salary = salary;
        this.degree = degree;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
