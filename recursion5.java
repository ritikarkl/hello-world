public class recursion5 {
    
    // optimized technique
    //  x^n = (x^n/2 )* (x^n/2) stack height = (log n) 

    public static int calcPower(int x , int n) {

        if(x==0){
            return 0;

        }
        if(n==0){
            return 1;
        }
        //if n is even     
        if(n%2==0){
           return calcPower(x, n/2) * calcPower(x, n/2) ;

        }
        // if n is odd 
        else{
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
            
        }

        
    }

    public static void main(String[] args) {
        int x=2;
        int n=5;
        int ans=calcPower(x, n); 
        System.out.println(ans);
    }
}
