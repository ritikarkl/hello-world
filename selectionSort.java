public class selectionSort {

    public static void arraysort(int array[]) {

        for(int i=0 ; i<array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
    }

    public static void main(String[] args) {
        
        int array[] = {2,5,7,3,1};
        for(int i =0 ; i <array.length-1; i++){
            int smallest=i;
            for(int j=i+1; j<array.length;j++){
                if(array[j]<array[smallest]){
                    smallest=j;

                }
            }

            int temp = array[smallest];
            array[smallest] = array[i];
            array[i]=temp;

        }


         

         arraysort(array);
    }
    
}
