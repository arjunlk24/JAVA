import java.util.*;
public class starSquare {
    public static void main(String[] args){
        //making square
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = enter.nextInt();
        for(int i=0; i<n; i++){
            //rows
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
