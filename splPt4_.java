import java.util.*;
public class splPt4_ {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = enter.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" "+" ");
            }
            
            for(int k=1; k<=i; k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
    }
    
}
