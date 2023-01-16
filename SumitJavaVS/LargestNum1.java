import java.util.Scanner;

public class LargestNum1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max=0;
        if (a > b) {
            max = a;
            //System.out.println(a);
        } else {
            max = b;
            //System.out.println(b);
         }
         if(c >max){
            max= c;
         //System.out.println(c);
         }
         System.out.println(max);
        }
}
