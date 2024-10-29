public class Employee implements Person {
    private int age;
    private String gender;

    public Employee( int age, String gender) {
        this.age = age;
        this.gender = gender;
    }
@Override
    public void getInfo() {
        System.out.println("Age: " + age + " Gender: " + gender);
    }
    public int yearsSinceTwenty() {
        return Math.max(age - 20, 0);
    }

}