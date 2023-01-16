import java.util.Scanner;

public class NameRet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = in.next();
        String person = myGreet(name);
        System.out.println(person);
    }
    static String myGreet(String name){
        String msg = "Hello" + name;
        return msg;
    }
}
