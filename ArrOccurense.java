package Array1D;

import java.util.Arrays;

public class ArrOccurense {
    public static void main(String[] args){
        int key=3;
        int[] array={3,9,2,3,1,7,2,5,3};
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int j=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=key){
                array[j++]=array[i];
            }
        }
        for(int i=0;i<j;i++){
            System.out.print(array[i] +  " ");
        }
       
    }
}
