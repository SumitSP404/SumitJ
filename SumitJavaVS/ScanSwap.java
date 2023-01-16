import java.util.Scanner;

public class ScanSwap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a and b value");
        int a = in.nextInt();
        int b = in.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);

    }
}
