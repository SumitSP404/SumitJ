import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double area;
        double pi=3.14;
       // Scanner in = new Scanner(System.in);
        //double r = in.nextDouble();
        area = pi*r*r;
        System.out.println("Area of Circle:" +area);
    }
}
