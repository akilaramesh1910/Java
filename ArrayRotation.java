package Array1D;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        rotate(arr);
    }
    public static void rotate(int[] arr){
        int first=arr[0];
        int second=arr[1];
        for(int i=0;i<arr.length-2;i++){
            arr[i]=arr[i+1+1];
        }
        arr[arr.length-1]=second;
        arr[arr.length-2]=first;
        System.out.println(Arrays.toString(arr));
    }
}
