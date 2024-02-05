package Array1D;

public class ArraySort {
    public static void main(String[] args){
        int[] arr1={-5,-9,7,12,1,3};
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                   
                if(arr1[i]>arr1[j]){
                    int temp=arr1[j];
                    arr1[j]=arr1[i];
                    arr1[i]=temp;
                }
        
            }
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
