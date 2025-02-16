import java.util.*;
public class hollow {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = enter.nextInt();
        for(int i=1; i<=num; i++){
            //rows
            for(int j=1; j<=num; j++){
                //cols
                if(i==1 || i==num || j==1 || j==num){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
    
}
