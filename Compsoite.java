import java.util.*;
public class Compsoite {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter NUmber: ");
        int n = enter.nextInt();

        int x = 0;
        for(int i =2; i<=n-1; i++){
            if(n%i==0){
                System.out.print("Composite number");
                x = 1;
                break;
            }
        }
            if(n==1){
                System.out.println("Neither prime nor composite");
            }else if(x==0){
                System.out.println("Prime Number");
            }
        }
    }

    

