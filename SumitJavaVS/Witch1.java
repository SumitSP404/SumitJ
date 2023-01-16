import java.util.Scanner;

public class Witch1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fru=in.next();
        switch (fru) {
            case "Mango"-> System.out.println("A mongo fruit");
            case "Orange"->System.out.println("A orange fruit");
            case "Tomato"->System.out.println("A vegetable");
            default->System.out.println("enter valid fruit");
        }
                
    
    }
}
