
import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get
        int element = list.get(0);
        System.out.println(element);

        //add  in between
        list.add(1, 1);
        System.out.println(list);

        //set
        list.set(0, 5);
        System.out.println(list);
         
        //remove
        list.remove(3);
        System.out.println(list);

        //size
        System.out.println(list.size());
            
        //loop
        for(int i=0; i<list.size() ; i++){
        System.out.print(list.get(i));
        }
        System.out.println();
  
        //sort
        Collections.sort(list);
        System.out.println(list);


    }
    
}
