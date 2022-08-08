public class recursion13 {
    
    public static String keypad[] = {".", "abc", "def" , "ghi", "jkl" , "mno" , "pqrs", "tu", "vwx" , "yz"};

    public static void printComnbination(String str , int indx , String combination) {
          if(indx==str.length()){
              System.out.println(combination);
              return;
          }

        char currChar = str.charAt(indx);
        String mapping = keypad[currChar - '0'];
         for(int i =0 ; i<mapping.length(); i++){
             printComnbination(str, indx+1, combination+mapping.charAt(i));
         }";
            printComnbination(str, 0, "");
         }
        
    }





