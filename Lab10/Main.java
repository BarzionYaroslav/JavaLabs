import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();
        boolean flag=true;
        while(flag){
            System.out.println("0: End Program");
            System.out.println("1: Add student");
            System.out.println("2: Delete student");
            System.out.println("3: Change grade");
            System.out.println("4: Change scholarship");
            System.out.println("5: Add visit marks");
            System.out.println("6: Show all students");
            int choice=inputInt("Enter your choice: ");
            boolean subflag;
            int subchoice;
            switch(choice){
                case 0:
                    flag=false;
                    break;
                case 1:
                    group.addStudent();
                    break;
                case 2:
                    group.deleteStudent();
                    break;
                case 3:
                    group.changeGrade();
                    break;
                case 4:
                    group.changeScholarship();
                    break;
                case 5:
                    subflag=true;
                    while(subflag){
                        subflag=false;
                        System.out.println("0: Cancel");
                        System.out.println("1: Change visit marks");
                        System.out.println("2: Change skip marks");
                        subchoice=inputInt("Enter your choice: ");
                        switch(subchoice){
                            case 0:
                                break;
                            case 1:
                                group.changeVisitedClass();
                                break;
                            case 2:
                                group.changeSkippedClass();
                                break;
                            default:
                                System.err.println("Invalid choice");
                                subflag=true;
                                break;
                        }
                    }
                    break;
                case 6:
                    subflag=true;
                    while(subflag){
                        subflag=false;
                        System.out.println("0: Cancel");
                        System.out.println("1: Sort by marks");
                        System.out.println("2: Sort by scholarship");
                        System.out.println("3: Sort by grade");
                        System.out.println("4: Don't sort");
                        subchoice=inputInt("Enter your choice: ");
                        switch(subchoice){
                            case 0:
                                break;
                            case 1:
                                group.printStudentsSortMarks();
                                break;
                            case 2:
                                group.printStudentsSortScholarship();
                                break;
                            case 3:
                                group.printStudentsSortGrade();
                                break;
                            case 4:
                                group.printStudents();
                                break;
                            default:
                                System.err.println("Invalid choice");
                                subflag=true;
                                break;
                        }
                    }
                    break;
                default:
                    System.err.println("Invalid choice");
                    break;
            }
        }
    }
    public static double inputNumber(String why)
    {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(why);
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            }
            System.out.println("Nuh uh! Redo!");
            sc.nextLine();
        }
    }

    public static int inputInt(String why)
    {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(why);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            }
            System.out.println("Nuh uh! Redo!");
            sc.nextLine();
        }
    }

    public static String inputString(String why)
    {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(why);
            if (sc.hasNextLine()) {
                return sc.nextLine();
            }
            System.out.println("Nuh uh! Redo!");
            sc.nextLine();
        }
    }
}
