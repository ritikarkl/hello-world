public class smallestelemt {
    

    public static int SmallestElement(int arr[]){
        int min = arr[0];
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]<min){
                min=arr[i];

            }
        }
       return min;

    } 

    public static void main(String[] args) {
      
        int arr1[]={2,9,8,8,7,3,2,9,1,0};
        System.out.println("the smallest elemnt in the array is :" +SmallestElement(arr1));
        
    } 
        
    
}
