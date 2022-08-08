public class recursion10 {

//removeduplicates = "aabbbcccchggguuffe"
public static boolean map[] = new boolean[26]; //sare mei by default false store hoga

public static void removeDuplicates(String str, int indx, String newString) {
     if(indx==str.length()){
         System.out.println(newString);
         return;

     }
    char currchar = str.charAt(indx);

    if(map[currchar - 'a']== true){
          removeDuplicates(str, indx+1, newString);
    }
    else{
        newString = newString+currchar;
             map[currchar - 'a'] = true;
             removeDuplicates(str, indx+1, newString);
    }
    
}
public static void main(String[] args) {
    String str = "aabbbcccchggguuffe" ;
    removeDuplicates(str , 0 , "");
    
}

    
}
