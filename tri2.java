import java.util.*;
public class tri2 {
    public static void main(String[] args){
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = enter.nextInt();
        for(int i=1; i<=num; i++ ){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    
}
