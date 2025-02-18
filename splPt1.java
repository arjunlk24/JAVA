import java.util.*;

public class splPt1 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = enter.nextInt();
        int mid = num/2 + 1;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                if(i==mid || j==mid){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
                
            }
            System.out.println();
        }
    }
    
}