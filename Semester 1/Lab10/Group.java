import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Group {
    private List<Student> students;
    private TreeSet<Student> studentsSortGrade;
    private TreeSet<Student> studentsSortScholarship;
    private TreeSet<Student> studentsSortMarks;

    public Group() {
        this.students = new ArrayList<Student>();
        this.studentsSortGrade = new TreeSet<Student>(((o1, o2) ->
                o1.getGrade() > o2.getGrade()? 1: -1));
        this.studentsSortScholarship = new TreeSet<Student>(((o1, o2) ->
                o1.getScholarship() > o2.getScholarship()? 1: -1));
        this.studentsSortMarks = new TreeSet<Student>(((o1, o2) ->
                o1.getMarks() > o2.getMarks()? 1: -1));
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addStudent(){
        boolean tempGender = false;
        int tempAge = 0;
        double tempGrade = 0;
        boolean tempFlag = true;
        String tempName = "Marisa Kirisame";
        double tempScholarship = 0;
        int tempvClass = 0;
        int tempsClass = 0;
        while (tempFlag) {
            try {
                tempFlag = false;
                tempName = Main.inputString("Enter student name: ");
                if (tempName.equals("Satori Komeiji")) {
                    throw new ImpossibleStudentException("No such student can ever exist");
                }
            } catch (ImpossibleStudentException e) {
                System.err.println(e.getMessage());
                tempFlag = true;
            }
        }
        tempFlag = true;
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
                if (tempAge < 0) {
                    throw new NotCorrectAgeException("Age can't be lower than 0!");
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
        tempFlag = true;
        while (tempFlag) {
            try {
                tempFlag = false;
                tempScholarship = Main.inputNumber("Enter scholarship: ");
                if (tempScholarship < 0) {
                    throw new NotCorrectAgeException("Scholarship can't be lower than 0!");
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
                tempvClass = Main.inputInt("Enter visited classes: ");
                if (tempvClass < 0) {
                    throw new NotCorrectAgeException("Visited classes can't be lower than 0!");
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
                tempsClass = Main.inputInt("Enter skipped classes: ");
                if (tempsClass < 0) {
                    throw new NotCorrectAgeException("Skipped classes can't be lower than 0!");
                }
            } catch (NotCorrectAgeException e) {
                System.err.println(e.getMessage());
                tempFlag = true;
            }
        }
        Student tempStudent = new Student(tempAge, tempGender, tempName,
                tempsClass, tempvClass, tempGrade, tempScholarship);
        addStudent(tempStudent);
    }

    public void deleteStudent(){
        if (!students.isEmpty()) {
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
            System.err.println("Cannot delete student! Group can't be less than 0 students!");
        }
    }

    public void changeGrade(){
        printStudents();
        boolean tempFlag = true;
        int tempNum = 0;
        double tempGrade = 0;
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
        tempFlag = true;
        while (tempFlag) {
            try {
                tempFlag = false;
                tempGrade = Main.inputInt("Enter new student grade: ");
                if (tempGrade < 0) {
                    throw new NotCorrectAgeException("Grade can't be less than 0!");
                }
            } catch (NotCorrectAgeException e) {
                System.err.println(e.getMessage());
                tempFlag = true;
            }
        }
        students.get(tempNum - 1).setGrade(tempGrade);
        System.out.println("Grade has been changed!");
    }

    public void changeScholarship(){
        printStudents();
        boolean tempFlag = true;
        int tempNum = 0;
        double tempScholarship = 0;
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
        tempFlag = true;
        while (tempFlag) {
            try {
                tempFlag = false;
                tempScholarship = Main.inputInt("Enter new student scholarship: ");
                if (tempScholarship < 0) {
                    throw new NotCorrectAgeException("Scholarship can't be less than 0!");
                }
            } catch (NotCorrectAgeException e) {
                System.err.println(e.getMessage());
                tempFlag = true;
            }
        }
        students.get(tempNum - 1).setScholarship(tempScholarship);
        System.out.println("Scholarship has been changed!");
    }

    public void changeVisitedClass(){
        printStudents();
        boolean tempFlag = true;
        int tempNum = 0;
        double tempScholarship = 0;
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
        students.get(tempNum - 1).changeVisitedClasses();
        System.out.println("Visit marks have been changed!");
    }

    public void changeSkippedClass(){
        printStudents();
        boolean tempFlag = true;
        int tempNum = 0;
        double tempScholarship = 0;
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
        students.get(tempNum - 1).changeSkippedClasses();
        System.out.println("Skip marks have been changed!");
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void printStudents(){
        for(int i=0; i<this.students.size(); i++){
            System.out.println((i+1) + ": " + this.students.get(i).toString());
        }
    }
    public void printStudentsSortGrade(){
        this.studentsSortGrade.addAll(this.students);
        int tempNum = this.studentsSortGrade.size();
        for(int i=0; i<tempNum; i++){
            System.out.println((i+1) + ": " + this.studentsSortGrade.pollLast().toString());
        }
        this.studentsSortGrade.clear();
    }
    public void printStudentsSortMarks(){
        this.studentsSortMarks.addAll(this.students);
        int tempNum = this.studentsSortMarks.size();
        for(int i=0; i<tempNum; i++){
            System.out.println((i+1) + ": " + this.studentsSortMarks.pollLast().toString());
        }
        this.studentsSortMarks.clear();
    }
    public void printStudentsSortScholarship(){
        this.studentsSortScholarship.addAll(this.students);
        int tempNum = this.studentsSortScholarship.size();
        for(int i=0; i<tempNum; i++){
            System.out.println((i+1) + ": " + this.studentsSortScholarship.pollLast().toString());
        }
        this.studentsSortScholarship.clear();
    }
}
