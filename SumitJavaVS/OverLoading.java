public class OverLoading {
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(int x, int y){
        System.out.println(x+ " " +y);
    }
    static void fun(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        fun(10);
        fun(20,30);
        fun("Sumit");
    }
}
