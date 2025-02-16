import java.util.*;
public class SwitchPrac2 {
    public static void main(String[] args){
        System.out.println("----CALCULATOR-----");
        System.out.println("- -> SUBSTRACT");
        System.out.println("+ -> ADD");
        System.out.print("ENTER + or -");
        Scanner value = new Scanner(System.in);
        char character = value.next().charAt(0);
        switch (character) {
            case '+':
            Scanner enter = new Scanner(System.in);
            System.out.print("Enter a: ");
            int a = enter.nextInt();
            System.out.print("Enter b: ");
            int b = enter.nextInt();
            System.out.print(a+b);
            break;
            case '-':
            Scanner enters = new Scanner(System.in);
            System.out.print("Enter a: ");
            int c = enters.nextInt();
            System.out.print("Enter b: ");
            int d = enters.nextInt();
            System.out.print(c-d);
            break;
            default:
            System.out.print("Enter valid operator");

        }

    }
    
}
