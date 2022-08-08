public class recursion4 {
    
    //x^n = x*x*x*x*.......n (stack height = n)
    public static int printPower(int x, int n){
            if(x==0){
                return 0; //base case1

            }
            if(n==0){
                return 1; //base case2

            }
         int xpownm1 = printPower(x, n-1);
         int xpown = x*xpownm1;
         return xpown;


 
    }
    public static void main(String[] args) {
        int x=5; 
        int n =10 ;
        int ans = printPower(x, n);
        System.out.println(ans);
    }

}
