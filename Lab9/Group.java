import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> students;

    public Group() {
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        try {
            this.students.add(student);
            if (this.students.size() > 15) {
                throw new ArithmeticException("Too many students! Can't add more than 15 students!");
            }
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
            this.students.removeLast();
        }
    }

    public void addStudent(){
        String tempName = Main.inputString("Enter student name: ");
        boolean tempGender = false;
        int tempAge = 0;
        int tempCourse = 0;
        double tempGrade = 0;
        boolean tempFlag = true;
        while (tempFlag) {
            try {
                tempFlag = false;
                int tempChoice = Main.inputInt("Enter gender (1 for female, 0 for male): ");
                if (tempChoice != 1 && tempChoice != 0) {
                    throw new ArithmeticException("Invalid gender! Try again!");
                }
                else{
                    if (tempChoice == 1) {
                        tempGender = true;
                    }
                    if (tempChoice == 0) {
                        tempGender = false;
                    }
                }
            } catch (ArithmeticException e) {
                System.err.println(e.getMessage());
                tempFlag = true;
            }
        }
        tempFlag = true;
        while (tempFlag) {
            try {
                tempFlag = false;
                tempAge = Main.inputInt("Enter age: ");
                if (tempAge < 16 || tempAge > 60) {
                    throw new NotCorrectAgeException("Age can't be lower than 16 and more than 60 years!");
                }
            } catch (NotCorrectAgeException e) {
                System.err.println(e.getMessage());
                tempFlag = true;
            }
        }
        tempFlag = true;
        while (tempFlag) {
            try {
                tempFlag = false;
                tempCourse = Main.inputInt("Enter course: ");
                if (tempCourse < 1) {
                    throw new NotCorrectAgeException("Course can't be lower than 1!");
                }
            } catch (NotCorrectAgeException e) {
                System.err.println(e.getMessage());
                tempFlag = true;
            }
        }
        tempFlag = true;
        while (tempFlag) {
            try {
                tempFlag = false;
                tempGrade = Main.inputNumber("Enter grade: ");
                if (tempGrade < 0) {
                    throw new NotCorrectAgeException("Grade can't be lower than 0!");
                }
            } catch (NotCorrectAgeException e) {
                System.err.println(e.getMessage());
                tempFlag = true;
            }
        }
        Student tempStudent = new Student(tempAge, tempGender, tempName, tempCourse, tempGrade);
        addStudent(tempStudent);
    }

    public void deleteStudent(){
        if (students.size() > 3) {
            printStudents();
            boolean tempFlag = true;
            int tempNum = 0;
            while (tempFlag) {
                try {
                    tempFlag = false;
                    tempNum = Main.inputInt("Enter student number: ");
                    if (tempNum < 1 || tempNum > this.students.size()) {
                        throw new NotCorrectAgeException("Student not on the list!");
                    }
                } catch (NotCorrectAgeException e) {
                    System.err.println(e.getMessage());
                    tempFlag = true;
                }
            }
            students.remove(tempNum - 1);
            System.out.println("Student has been deleted! Bye bye!");
        }
        else{
            System.err.println("Cannot delete student! Group can't be less than 3 students!");
        }
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void printStudents(){
        for(int i=0; i<this.students.size(); i++){
            System.out.println((i+1) + ": " + this.students.get(i).toString());
        }
    }
}
