public class recursion14 {

     public static void printPermutation(String str, String permutation) {
      if(str.length()==0){
          System.out.println(permutation);
          return;

      }
      for(int i = 0 ; i<str.length() ; i++){
          char currChar = str.charAt(i);
           String newstr= str.substring(0, i) +str.substring(i+1);
           printPermutation(newstr, permutation+currChar);
      }
        
    }
    public static void main(String[] args) {
        String str = "abcdef";
        printPermutation(str, "");
    }
    
}
