public class recursion16 {

//place tiles horizontally or vertically 
public static int  placeTiles(int n , int m ){

    if(n==m){
        return 2;
    }
    if(n<m){
        return 1;
    }

    //vertically 
   int verplacements = placeTiles(n-m, m);

    //horizontally 
    int horplacements = placeTiles(n-1, m);

    return verplacements+horplacements;
    

}
public static void main(String[] args) {
 int n=3; int m =3;
   System.out.println( placeTiles(n, m));

}
    
}
