public class recursion {
  //sum=1+2+3+4+.......+n

    public static void printSum(int i, int n , int sum) {
        if(i==n){
       sum=sum+i;
      System.out.println(sum);
       return;
        
         }
        sum=sum+i;
        printSum(i+1, n, sum);
        System.out.println(i);
     

        
    }
    
    public static void main(String[] args) {
        printSum(1, 10, 0);
       
        
    }
} 