import java.util.*;
public class forloop {
    public static void main(String[] args){
        int count = 1;
        char astric = '*';
        for(int i=0; i<=4; i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
            
            count++;
        }
    }
    
}
