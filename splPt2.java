import java.util.*;
public class splPt2 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = enter.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                if(i==j || i+j==num+1){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
                
            }
            System.out.println();
        }
    }
    
}
