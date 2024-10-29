public class Employee implements Person {
    private int age;
    private String gender;

    public Employee( int age, String gender) {
        this.age = age;
        this.gender = gender;
    }
@Override
    public void getInfo() {
    int yearsSinceTwenty = (age < 20) ? 0 : age - 20;
    System.out.println("Age: " + age + ", Gender: " + gender +
            ", Years since turning 20: " + yearsSinceTwenty);
    }


}