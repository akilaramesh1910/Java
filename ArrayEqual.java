package Array1D;

public class ArrayEqual {
    public static void main(String[] args){
        int[] arr1={4};
        int[] arr2={23,4};
        if(arr1.length!=arr2.length){
            System.out.println("NO");
            System.exit(0);
        }
        for(int i=0;i<arr1.length;i++){
    
            if(arr1[i]!=arr2[i]){
                System.out.println("NO");
                System.exit(0);
            }
           
        }
            System.out.println("YES");
        
    }
}
