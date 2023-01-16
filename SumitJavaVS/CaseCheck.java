import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char ch=in.next().trim().charAt(0);
        String word = "Sumit";
        if(ch>='a'&& ch<='z'){
            System.out.println("lower case");
        }else{
            System.out.println("upper case");
        }
        System.out.println(word.charAt(3));
      // wrong// System.out.println(word.int(charAt(i)));    
    }
}
// .trim() removes the unwanted space
// char does'nt have any input statement so take it as string, in.next() and to display the character present in any index, .charAt()