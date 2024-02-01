import java.util.*;

public class SumWeights{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number from (1-10): ");
        int num=sc.nextInt();
        System.out.println(("Enter the " + num + " numbers: "));
        int arr[]=new int[num];
        int arr1[]=new int[num];
        int arr2[]=new int[num];
        int arr3[]=new int[num];
        int arr4[]=new int[num];
    
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    
        for(int i=0;i<arr.length;i++){
            int k=arr[i];
            for(int j=1;j<=k;j++){
                if(arr[i]==j*j){
                    arr1[i]=5;
                }
            }
            // System.out.print(arr1[i] + " ");
        }
        // System.out.println();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%4==0 && arr[i]%6==0){
                arr2[i]=4;
            }
            // System.out.print(arr2[i] + " ");
        }
        // System.out.println();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr3[i]=3;
            }
            // System.out.print(arr3[i] + " ");
        }
        // System.out.println();
        for(int i=0;i<arr.length;i++){
            arr4[i]=arr1[i]+arr2[i]+arr3[i];
            // System.out.print(arr4[i] + " ");
        }
        // System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.println("< " + arr[i] + " , " + arr4[i] + ">");
        }
    }
}