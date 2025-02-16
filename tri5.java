import java.util.*;
public class tri5 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=enter.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                if(i%2!=0){
                    System.out.print(j+" ");
                }else if(i%2==0){
                    System.out.print((char)(j+64)+" ");

                }

            }
            System.out.println();
        }
    }    
}
