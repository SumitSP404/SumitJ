import java.util.Scanner;

public class UcountNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        while(n>0){
            int rem=n%10;
            if(n>=0 && n<=9){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
