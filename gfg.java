public class gfg {
    public  class Base {
        public void show() {
        System.out.println("Base::show() called");
        }
    }
    
    public class Derived extends Base {
        public void show() {
        System.out.println("Derived::show() called");
        }
    }
    
    public static void main(String[] args) {
        
        Base b = new Derived();
        b.show();
    


    } 
        
}
