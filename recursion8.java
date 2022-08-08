public class recursion8 {
  // find 1st and last occurence of element in a string 

    public static int first = -1;
    public static int last = -1;
     public static void finOccurence(String str , int indx , char element) {
          if(indx==str.length()){
              System.out.println(first);
              System.out.println(last);
              return;

          }

        char currchar = str.charAt(indx);
        if  (currchar==element){
        if (first == -1){

            first = indx;
        }
        else {

            last = indx;
        }
        
        }
        finOccurence(str, indx+1, element);
      

     }
    
     public static void main(String[] args) {
        String str = "aardthvuudfasafbcvgaagfxdaxgbjgdfawsazxgfdsdcan";
        finOccurence(str, 0, 'a');
     }
}
