public class recursion9 {

    public static boolean isSorted(int arr[], int indx){

        if(indx==arr.length-1){
            return true;
        }

        if(arr[indx]<arr[indx+1]){ 
            //array is still sorted

          return  isSorted(arr, indx+1);
        
        }
        else
        {
            return false;
        }

    }
    
    public static void main(String[] args) {
        int arr[] =  {1,7,9,23,45,3 };
        System.out.println(isSorted(arr, 0));

        
    }
}
