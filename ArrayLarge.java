package Array1D;

public class ArrayLarge {
    public static void main(String[] args){
        int[] arr={10,20,100,54,10};
        int large=arr[0];
        for(int i=1;i<arr.length;i++){
              if(arr[i]>large){
                large=arr[i];
              }
        }
        System.out.println(large);
    }
}
