
import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class loops {
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int input;

         do{
            double marks=sc.nextDouble();
            if (marks>=90)
            
            System.out.println("this is good");
            else if(marks<90 && marks>=60)
            System.out.println("this also good as well");
         else if(marks<60 && marks>=0)
         System.out.println("this is ok");
         else 
         System.out.println("invalid");
         
        
         
         System.out.println("want to continue ? (yes(1) or  no (0))");
         input = sc.nextInt();
        }while(input==1);
        
    } 
        
    
    
}
