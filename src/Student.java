class Student implements Person {
    private int age;
    private String gender;

    public Student(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    @Override
    public void getInfo() {
        System.out.println("Age: " + age + " Gender: " + gender);
    }

}