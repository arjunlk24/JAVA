import java.util.*;
public class GP {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("ENter the NUmber: ");
        int a =2;
        int n = enter.nextInt();
        for(int i = 1; i<n; i++){
            System.out.println(a);
            a*=2;
        }

    }
    
}
