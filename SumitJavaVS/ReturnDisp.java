
import java.util.Scanner;

public class ReturnDisp {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter n1");
        int n1 = in.nextInt();
        System.out.println("enter n2");
        int n2 = in.nextInt();
        int n3 = n1 + n2;
        System.out.println(n3);
    } 
}
