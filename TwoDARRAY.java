
 import java.util.*;
public class TwoDARRAY {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
         System.out.println("enter the elements of matrix :");
         for(int i=0; i<rows ; i++){
             for(int j=0;j<cols; j++){
                 a[i][j] = sc.nextInt();

             }
         }

         int x = sc.nextInt();
         for(int i=0; i<rows; i++){
             for(int j=0; j<cols; j++){
                 if(a[i][j]==x)
                 {
                     System.out.print("x is found at :" + "(" + i + "," + j + ")");
                 }
             }
         }


        


    }
    
}
