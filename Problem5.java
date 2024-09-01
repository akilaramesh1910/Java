public class Problem5 {
    
    // static int i = 0; 

    static {
        i = 10; 
    }

    static int i = 0; 

    static {
        ++i;    
    }

    public static void main(String[] args) {
        new Problem5();
        System.out.println(i);  
    }
}
