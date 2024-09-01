public class Problem15 {
    public static void main(String[] args) {
        System.out.println(Values.B);
    }
}

enum Values{
    A(1),B(2),C(3);

    Values(int i){
        System.out.println(i);
    }
    
    static{
        System.out.println("static");
    }
}
