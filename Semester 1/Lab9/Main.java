import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();
        boolean flag=true;
        while(flag){
            System.out.println("Group:");
            group.printStudents();
            System.out.println("Choices: ");
            System.out.println("0: End Program");
            System.out.println("1: Add dummy student");
            System.out.println("2: Add student");
            System.out.println("3: Delete student");
            int choice=inputInt("Enter your choice: ");
            switch(choice){
                case 0:
                    flag=false;
                    break;
                case 1:
                    group.addStudent(new Student());
                    break;
                case 2:
                    group.addStudent();
                    break;
                case 3:
                    group.deleteStudent();
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
