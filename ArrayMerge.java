package Array1D;

import java.util.Arrays;

public class ArrayMerge {
    public static void main(String[] args){
        int[] arr1={1,3,3,3};
        int[] arr2={1,4,6,8};
        int n=4;
        int[] arr3=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[n++]=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
