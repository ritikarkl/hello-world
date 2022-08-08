public class recursion11 {
    // subsequences of string "abc"
    public static void printSubsequences(String str, int indx, String newString) {
    if(indx == str.length()){
        System.out.println(newString);
        return;

    }

        
        char currchar = str.charAt(indx);


        //to be added
        printSubsequences(str, indx+1, newString+currchar);
        
        //to be not added
        printSubsequences(str, indx+1, newString);
    }
    
   public static void main(String[] args) {
            String str = "abcccdcdc";
            printSubsequences(str, 0 , "");

    
}

}
