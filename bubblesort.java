public class bubblesort {

    public static void main(String[] args) {
        
        int array[] = {7, 6 , 8 , 9 , 1};

        for(int i =0; i < array.length-1; i++){
            for(int j=0; j< array.length-i-1 ; j++){
                if(array[j]>array[j+1]){
                    //swap
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }

            }
        }
       arraysort(array);  
    }

    public static void arraysort(int array[]) {
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}   
//timecomplexity O(n^2)