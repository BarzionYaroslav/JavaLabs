import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person cirno = new Person();
        Employee marisa = new Employee("Marisa","Kirisame",
                true,false,"Magician",0,
                22,"Incident Resolvers");
        ReporterWorker ayaya = new ReporterWorker("Aya","Shameimaru",
                true,true,"Reporter",150,
                19,"Bunbunmaru","Rika returning with her Flower Tank again",
                "Hatate Himekaidou");
        String[] temp = {"Flower Tank","Shrine Tank","Evil Eye Sigma"};
        EngineerWorker rika = new EngineerWorker("Rika","Asakura",
                true,true,"Tank Engineer",0,
                27,"I am my own department!!!",temp);
        //I would've done more, but I was out of ideas, plus I think it already shows enough
        boolean flag=true;
        while (flag){
            System.out.println("0: Stop program");
            System.out.println("1: " + cirno.getName() + " " + cirno.getSurname() + ", Unemployed");
            System.out.println("2: " + marisa.getName() + " " + marisa.getSurname() + ", Employee");
            System.out.println("3: " + ayaya.getName() + " " + ayaya.getSurname() + ", Reporter");
            System.out.println("4: " + rika.getName() + " " + rika.getSurname() + ", Engineer");
            int choice = inputNumber("Choose a person on the list: ");
            while (choice < 0 || choice > 4){
                System.out.println("Enter a number on the list");
                choice = inputNumber("Choose a person on the list: ");
            }
            int choiceB = -4;
            boolean flagB = true;
            //Everyone is female... I couldn't make a funny Touhou Project code if there was someone male, now could I?
            switch (choice) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    while (flagB) {
                        System.out.println(cirno.getName() + " " + cirno.getSurname() + ", " +
                                (cirno.isGender() ? "Female, " : "Male, ") + (cirno.isActive() ? "Active" : "Not Active"));
                        System.out.println("0: Go back");
                        System.out.println("1: Check");
                        System.out.println("2: Reverse Active");
                        while (choiceB<0||choiceB>2) {
                            choiceB = inputNumber("Choose an action: ");
                        }
                        System.out.println(" ");
                        switch (choiceB) {
                            case 0:
                                flagB = false;
                                break;
                            case 1:
                                cirno.sleep();
                                break;
                            case 2:
                                cirno.setActive(!cirno.isActive());
                                break;
                        };
                        choiceB = -4;
                    }
                    break;
                case 2:
                    while (flagB) {
                        System.out.println(marisa.getName() + " " + marisa.getSurname() + ", " +
                                (marisa.isGender() ? "Female, " : "Male, ") +
                                (marisa.isActive() ? "Active" : "Not Active") + ",\n" +
                                marisa.getPosition() + ", Payment " + marisa.getPayment() +
                                ", Experience " + marisa.getExperience() + ",\nDepartment: " + marisa.getDepartament());
                        System.out.println("0: Go back");
                        System.out.println("1: Check");
                        System.out.println("2: Reverse Active");
                        System.out.println("3: Work");
                        while (choiceB<0||choiceB>3) {
                            choiceB = inputNumber("Choose an action: ");
                        }
                        System.out.println(" ");
                        switch (choiceB) {
                            case 0:
                                flagB = false;
                                break;
                            case 1:
                                marisa.sleep();
                                break;
                            case 2:
                                marisa.setActive(!marisa.isActive());
                                break;
                            case 3:
                                marisa.work();
                                break;
                        };
                        choiceB = -4;
                    }
                    break;
                case 3:
                    while (flagB) {
                        System.out.println(ayaya.getName() + " " + ayaya.getSurname() + ", " +
                                (ayaya.isGender() ? "Female, " : "Male, ") +
                                (ayaya.isActive() ? "Active" : "Not Active") + ",\n" +
                                ayaya.getPosition() + ", Payment " + ayaya.getPayment() +
                                ", Experience " + ayaya.getExperience() + ",\nDepartment: " + ayaya.getDepartament());
                        System.out.println("0: Go back");
                        System.out.println("1: Check");
                        System.out.println("2: Reverse Active");
                        System.out.println("3: Work");
                        System.out.println("4: News");
                        while (choiceB<0||choiceB>4) {
                            choiceB = inputNumber("Choose an action: ");
                        }
                        System.out.println(" ");
                        switch (choiceB) {
                            case 0:
                                flagB = false;
                                break;
                            case 1:
                                ayaya.sleep();
                                break;
                            case 2:
                                ayaya.setActive(!ayaya.isActive());
                                break;
                            case 3:
                                ayaya.work();
                                break;
                            case 4:
                                ayaya.news();
                                break;
                        };
                        choiceB = -4;
                    }
                    break;
                case 4:
                    while (flagB) {
                        System.out.println(rika.getName() + " " + rika.getSurname() + ", " +
                                (rika.isGender() ? "Female, " : "Male, ") +
                                (rika.isActive() ? "Active" : "Not Active") + ",\n" +
                                rika.getPosition() + ", Payment " + rika.getPayment() +
                                ", Experience " + rika.getExperience() + ",\nDepartment: " + rika.getDepartament());
                        System.out.println("0: Go back");
                        System.out.println("1: Check");
                        System.out.println("2: Reverse Active");
                        System.out.println("3: Work");
                        System.out.println("4: Projects");
                        while (choiceB<0||choiceB>4) {
                            choiceB = inputNumber("Choose an action: ");
                        }
                        System.out.println(" ");
                        switch (choiceB) {
                            case 0:
                                flagB = false;
                                break;
                            case 1:
                                rika.sleep();
                                break;
                            case 2:
                                rika.setActive(!rika.isActive());
                                break;
                            case 3:
                                rika.work();
                                break;
                            case 4:
                                rika.ask();
                                break;
                        };
                        choiceB = -4;
                    }
                    break;
            }
        }
    }
    public static int inputNumber(String why)
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
}
