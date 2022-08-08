public class recursion15 {
 //maze from 0,0 to 2,2 pauhuchna h
    public static int countPaths(int i, int j, int n , int m ){

        if(i==n || j==m){
            return 0;

        }
        if(i==n-1 && j==m-1){
            return 1;

        }
        //move downwards
        int downpaths = countPaths(i+1, j, n, m);
        
        //move rightwards
        int rightpaths = countPaths(i, j+1, n, m);
         
        //we wnt to calculate total no of paths
        return downpaths+rightpaths;

                                                              
    }

    public static void main(String[] args) {
        int n=3, m=3;
        int totalpaths= countPaths(0, 0 , n, m);
        System.out.println(totalpaths);

    }
    
}
