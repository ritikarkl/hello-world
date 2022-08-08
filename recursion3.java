 public class recursion3 {
     //fibonacci = 0 1 1 2 3 5 8 

     public static void printFibonacci(int a , int b , int n ) {
      if(n==0){
          return;

      }
        int c = a+b;
        System.out.println(c);
        printFibonacci(b, c, n-1);
         
     }
     public static void main(String[] args) {
         
        int a =0 ;
         int b =1;
         System.out.println(a);
         System.out.println(b);
         int n = 7;
         printFibonacci(a, b, n-2);
     }


 }