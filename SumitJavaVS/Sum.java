import java.util.Scanner;

public class Sum {
    /**
     * @param args
     */
    public static void main (String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter two num");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int add = n1 + n2;
        System.out.println("sum="+ add);
    }
}
