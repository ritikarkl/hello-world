
import java.util.*;

public class transpose {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int n = sc.nextInt();
         int m = sc.nextInt();
         int matrix[][]= new int[n][m];

         System.out.println("the elements of matrix:");
         for(int i=0; i<n; i++){
             for(int j=0; j<m; j++)
             {
                 matrix[i][j]= sc.nextInt();

             }
         }

         //transpose
         System.out.println("the transpose matrix :");

         for(int j=0; j<m; j++){
             for(int i=0; i<n; i++){
                 System.out.print(matrix[i][j] + "  ");

             }
             System.out.println();
         }
        
    }
    
}
