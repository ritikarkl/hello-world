public class recursion7 {
    // reverse a string 

    public static void printReverse(String str , int indx){
        if(indx==0){
            System.out.print(str.charAt(indx));
            return;
        }

        System.out.print(str.charAt(indx));
        printReverse(str, indx-1);


    }
    public static void main(String[] args) {
        String str = "abcdefgh";
        printReverse(str, str.length()-1);
    }
    
}
