import java.util.*;
public class sprTri2 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = enter.nextInt();
        int a=1;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
    
}
