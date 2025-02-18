import java.util.*;
public class splPt3_ {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = enter.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                if(i%2==1){
                    if(j%2==1){
                        System.out.print("1"+" ");
                    }else{
                        System.out.print("0"+" ");
                    }
                }else{
                    if(j%2==0){
                        System.out.print("1"+" ");
                    }else{
                        System.out.print("0"+" ");
                    }
                }
            }
            System.out.println();
        }
    }
    
}
