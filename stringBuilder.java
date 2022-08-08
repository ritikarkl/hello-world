
import java.util.*;
public class stringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("prateek");


    for(int i=0 ; i<sb.length()/2 ; i++){
         
        int front = i;
        int back = sb.length()-1-i;

        char frontchar = sb.charAt(back);
        char backchar = sb.charAt(front);

        sb.setCharAt(front, frontchar);
        sb.setCharAt(back, backchar);
    }
      System.out.println(sb);
    }
    
}
