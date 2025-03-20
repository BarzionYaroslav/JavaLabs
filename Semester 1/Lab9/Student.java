public class Student {
    private int age;
    private boolean gender;
    private String name;
    private int course;
    private double grade;
    public Student(int age, boolean gender, String name, int course, double grade) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
    public Student() {
        this.age = 18;
        this.gender = true;
        this.name = "Reimu Hakurei";
        this.course = 1;
        this.grade = 4.98;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 16 || age > 60) {
            throw new NotCorrectAgeException("Age can't be lower than 16 and more than 60 years!");
        }
        else
            this.age = age;
    }
    public boolean isGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    @Override public String toString() {
        return getName() + ": age " + getAge() + "; gender " + (this.gender? "female": "male")
                + "; course " + getCourse() + "; grade " + getGrade();
    }
}
