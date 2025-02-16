import java.util.*;
public class triangle {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter side a: \n");
        int a = enter.nextInt();
        System.out.print("Enter side b: \n");
        int b = enter.nextInt();
        System.out.print("Enter side c: \n");
        int c = enter.nextInt();
        // if (a+b>c && b+c>a && c+a>b){
        //     System.out.print("THIS IS TRIANGLE");
        // }else{
        //     System.out.print("NOT A TRINAGLE");
        // }
        System.out.print(((a+b>c)&&(a+c>b)&&(b+c>a)?("this is a Triangel"):("this is not a triangle")));


    }
    
}
