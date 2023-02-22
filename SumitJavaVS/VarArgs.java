import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
       // fun(1,22,333,4444,5,69);
        multiple(20,30,"sumit","purandare","vinay");
    }
    ///static void fun(int ...v){
       /// System.out.println(Arrays.toString(v));
     //}
     static void multiple(int a, int b, String ...x){
        System.out.println(Arrays.toString(x));
     }
}
