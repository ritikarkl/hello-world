public class recursion2 {

    //  fact = n*(n-1)*(n-2)*(n-3)*(n-4).....*1
    //  fact = n*(n-1)!
    // kaam = n*(n-1)!

    public static int calcFactorial(int n){

          if(n==1 || n==0){
              return 1;

          }
          int fact_minus  = calcFactorial(n-1);
          int fact = n*fact_minus;
           return fact;



    }

    public static void main(String[] args) {
        int n=5;

        int ans = calcFactorial(n);
        System.out.println(ans);
    }
}
