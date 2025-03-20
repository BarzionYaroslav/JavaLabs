public class Student {
    private int age;
    private boolean gender;
    private String name;
    private int skippedClasses;
    private int visitedClasses;
    private double grade;
    private double scholarship;
    public Student(int age, boolean gender, String name, int skippedClasses,
                   int visitedClasses, double grade, double scholarship) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.skippedClasses = skippedClasses;
        this.visitedClasses = visitedClasses;
        this.grade = grade;
        this.scholarship = scholarship;
    }
    public Student() {
        this.age = 18;
        this.gender = true;
        this.name = "Reimu Hakurei";
        this.grade = 4.98;
        this.skippedClasses = 0;
        this.visitedClasses = 0;
        this.scholarship = 0;
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
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public void changeSkippedClasses() {
        this.skippedClasses++;
    }
    public void changeVisitedClasses() {
        this.visitedClasses++;
    }
    public void setSkippedClasses(int visits) {
        this.skippedClasses=visits;
    }
    public void setVisitedClasses(int skips) {
        this.visitedClasses=skips;
    }
    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }
    public double getScholarship() {
        return scholarship;
    }
    public double getMarks(){
        return 100*Double.valueOf(this.visitedClasses)/Double.valueOf(this.skippedClasses+this.visitedClasses);
    }
    @Override public String toString() {
        return getName() + ": age " + getAge() + "; gender " + (this.gender? "female": "male")
                + "; scholarship " + getScholarship() + "; grade " + getGrade() + "; marks " + getMarks() +"%";
    }
}
