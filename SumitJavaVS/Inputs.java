import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter roll number:");
        int rollno = input.nextInt();
        System.out.println("your roll number is" + rollno);

        int a = 243_000_000; // basically to print millon or billion using int,_ is ignored in output
        System.out.println(a);
    }

}
