public class PlusOne{
    public static void main(String[] args) {
        int arr1[]={9,9,2,8,9};
        int arr2[]=plusOne(arr1);
        for(int m=0;m<arr2.length;m++){
            System.out.print(arr2[m] + " ");
        }
    }
    public static int[] plusOne(int[] digits) {
        int length=digits.length;
        for(int i=length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }
        int newarr[]=new int[length+1];
        newarr[0]=1;
        return newarr;
    }   
}