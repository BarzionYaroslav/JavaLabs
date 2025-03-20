import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Point3d point1 = new Point3d(inputNumber("Input X1"), inputNumber("Input Y1"), inputNumber("Input Z1"));
        Point3d point2 = new Point3d(inputNumber("Input X2"), inputNumber("Input Y2"), inputNumber("Input Z2"));
        Point3d point3 = new Point3d(inputNumber("Input X3"), inputNumber("Input Y3"), inputNumber("Input Z3"));
        System.out.println(computeArea(point1,point2,point3));
    }
    public static double computeArea(Point3d l1, Point3d l2, Point3d l3) {
        if (l1.compare(l2)||l1.compare(l3)||l2.compare(l3))
        {
            System.out.println("One of the points is equal to another! Nuh-uh!");
            return 0;
        }
        double a=l1.distanceTo(l2);
        double b=l2.distanceTo(l3);
        double c=l3.distanceTo(l1);
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
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
}
