
public class Main {
    public static void main(String[] args) {
        Student student = new Student(22, "Female");
        Employee employee = new Employee( 30, "Male");
        student.getInfo();
        System.out.println();
        employee.getInfo();
        System.out.println("Years since 20: " + employee.yearsSinceTwenty());

        }
    }
