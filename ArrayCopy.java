package Array1D;

public class ArrayCopy {
    public static void main(String[] args){
        int[] a={2,8,3};
        int[] b=new int[a.length];
        for(int i=0;i<=a.length-1;i++){
            b[i]=a[i];
        }
        System.out.print("elements of a: ");
        for(int i=0;i<=a.length-1;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("elements of a: ");
        for(int i=0;i<=b.length-1;i++){
            System.out.print(b[i] + " ");
        }
    }
}
