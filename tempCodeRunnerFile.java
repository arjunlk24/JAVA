import java.util.*;
public class tempCodeRunnerFile {
    // A 
    // A B 
    // A B C 
    // A B C D
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = enter.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(j+64)+" ");

            }
            System.out.println();
        }

    }
    
}