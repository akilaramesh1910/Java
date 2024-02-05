package Array1D;

import java.util.Arrays;

public class ArrCommon {
    public static void main(String[] args) {
        int k=0;
        String[] array1={"article","for","geeks","for","geeks"};
        System.out.println(Arrays.toString(array1));
        String[] array2={"article","geeks","geeks"};
        System.out.println(Arrays.toString(array2));
        int length=array1.length>array2.length ? array1.length : array2.length;
        String[] array3=new String[length];
        String[] array4=new String[length];
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length-1;j++){
                if(array1[i]==array2[j]){
                    array3[k++]=array2[j];
                }
            }
        }
        int n=0;
        for(int m=0;m<array3.length-1;m++){
            if(array3[m]!=array3[m+1]){
                array4[n++]=array3[m];
            }
        }
        array4[n++]=array3[array3.length-1];
        // System.out.println(Arrays.toString(array4));
        for(int i=0;i<n-1;i++){
            System.out.print(array4[i] + "  ");
        }
    }
}
