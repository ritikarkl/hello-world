public class largestelement {
    
    public static int LargestElement(int arr[]){

        int max = arr[0];
        for(int i =0; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];

            }
        }
    
    return max;

  }
 

  public static void main(String[] args) {
    
    int arr1[] = {2,5,8,7,1,8,0};
    System.out.println("the largest element in array is ="+ LargestElement(arr1));
  }

}
