import java.util.*;
public class splPt3 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = enter.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");

                }else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
    
}
