import java.util.*;
public class Loop3 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = enter.nextInt();
        int count=0;
        for(int i=1;i<=a;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        
    }
    
}
