import java.util.*;
public class numSquaer {
    // 1 2 3 4
    // 1 2 3 4
    // 1 2 3 4
    // 1 2 3 4

    public static void main(String[] args){
        // making number squar
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = enter.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        } 
    }
    
}
