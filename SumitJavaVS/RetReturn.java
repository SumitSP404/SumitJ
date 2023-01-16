import java.util.Scanner;
    
public class RetReturn {
    public static void main(String[] args) {
       int add = sum();
       System.out.println(add);
    }
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter n1");
        int n1 = in.nextInt();
        System.out.println("enter n2");
        int n2 = in.nextInt();
        int n3 = n1 + n2;
        return n3;
        //System.out.println(n3);
    } 
}


