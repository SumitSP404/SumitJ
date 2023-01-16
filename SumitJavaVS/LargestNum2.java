import java.util.Scanner;

public class LargestNum2 {
    public static void main(String[] args) {
       // int max=Math.max(50, 100);
        //System.out.println(max);
       //int max=Math.max(Math.max(30,50),96);
       //System.out.println(max);
      Scanner in = new Scanner(System.in);
      int a=in.nextInt();
       int b=in.nextInt();
       int c=in.nextInt();
       int max=Math.max(Math.max(a,b),c);
       System.out.println(max);
    
    }
}
