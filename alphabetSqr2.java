import java.util.*;
public class alphabetSqr2 {
    // A A A A 
    // B B B B 
    // C C C C 
    // D D D D 
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = enter.nextInt();
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                System.out.print((char)(i+65)+" ");
            }
            System.out.println();
        }
    }
    
}
