import java.util.*;
public class SwitchPrac {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        int value = enter.nextInt();
        switch (value){
            case 1:
            System.out.print("ONE");
            break;
            case 2:
            System.out.print("Two");
            break;
            case 3:
            System.out.print("Three");
            break;
            default:
            System.out.print("WORNG NUMBER");
        }

    }
    
}
