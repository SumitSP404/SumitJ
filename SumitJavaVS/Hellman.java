import java.util.Scanner;

class Hellman{
    private static long power(long a,long b,long P){
        if(b==1)
        return a;
        else
        return(((long)Math.pow(a,b)) %P);
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        long P,G,a,x,b,y,ka,kb;
       // P=23;
        P = in.nextLong();
        System.out.println("The public key for P:" +P);
        //G=17;
        G = in.nextLong();
        System.out.println("The public key for G:"+G);
       // a=4;
       a=in.nextLong();
        System.out.println("Private key for Alice:" +a);
        x=power(G,a,P);

        //b=3;
        b=in.nextLong();
        System.out.println("Private key for bob:"+b);
        y=power(G,b,P);

        ka=power(y,a,P);
        kb=power(x,b,P);
        System.out.println("seceret key for Alice:" +ka);
        System.out.println("seceret key for bob:" +kb);
    }
}