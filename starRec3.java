import java.util.*;
public class starRec3 {
    public static void main(String[] args){
        //making variable rows and coloums and making square.
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the Number of Rows: ");
        int rows = enter.nextInt();
        System.out.println("Enter the NUmber of Coloumns: ");
        int cols = enter.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("* ");

            }
            System.out.println();
        }
    
    }
    
}
