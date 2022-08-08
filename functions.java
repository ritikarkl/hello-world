
import java.util.*;
public class functions {
    
    public static void main(String args[]) {

         Scanner sc = new Scanner(System.in) ;

            int n = sc.nextInt();
            fibonacciSeries(n);
         return;
         

         
     }
        
        
    public static void fibonacciSeries(int n) {
        int a=0;
        int b=1;
        System.out.print(a+" "+b);
        int c;
        for(int i=1; i<=n; i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }


    }
}
    

