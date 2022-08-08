import java.util.*;

public class array {

    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
         
        System.out.println("Enter the elements to be sorted : ");

         for(int i=0; i<size; i++){
             numbers[i]=sc.nextInt();

         }

            int temp;
            for(int i=0; i<size; i++){
                  for(int j=i+1; j<size; j++){

                    if(numbers[i]>numbers[j]){
                        temp=numbers[i];
                        numbers[i]=numbers[j];
                        numbers[j]=temp;

                    }
                    }
                }
            for(int i=0; i<size; i++){
                System.out.print(numbers[i]+" ");
            }

            

         
        }

    }
