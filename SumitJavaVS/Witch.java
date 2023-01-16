import java.util.Scanner;

public class Witch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        
        switch (fruit) {
            case "Mango":
                System.out.println("A mongo fruit");
                break;
            case "Orange":
                System.out.println("A orange fruit");
                break;
            case "Tomato":
                System.out.println("A vegetable");
                break;
            default:
                System.out.println("enter valid fruit");
        }
    
   
}
}
