import java.io.*;
import java.math.*;
import java.util.*;
public class RSAA{
public static double gcd(double a, double h)
{
    double temp;
    while(true)
    {
        temp = a % h;
        if(temp == 0)
        return h;
        a=h;
        h=temp;
    }
}
public static void main(String[] args) {
    double p,q,n,e,phi;
    p=3;
    q=7;
    n=p*q;
    e =2;
    phi = (p-1)*(q-1);
    while(e<phi)
    {
        if(gcd(e,phi)==1)
        break;
        else
        e++;
    }
    int k = 2;
    double d = (1+(k*phi))/e;
    double msg = 12;
    System.out.println("Message:"+msg);
    double c = Math.pow(msg,e);
    c = c%n;
    System.out.println("encrypted:" +c);
    double m = Math.pow(c,d);
    m = m%n;
    System.out.println("original msg:" +m);

}
}
