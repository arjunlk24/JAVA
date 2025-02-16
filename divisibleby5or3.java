import java.util.*;
public class divisibleby5or3 {
    public static void main(String[] args){
    Scanner enter = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int n = enter.nextInt();
    if(n%5==0 || n%3==0){
        System.out.print("Entered number is divisible by 3 or 5");
    }else{
        System.out.print("Enter number is not divisible by 3");
    }
}
}
