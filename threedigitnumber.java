import java.util.*;
public class threedigitnumber {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = enter.nextInt();
        

        if(n>100 && n<1000){
            System.out.print("Entered number is 3 digit number");

        }else{
            System.out.print("Entered number is not 3 digit number");
        }
        
    }
    
}
