public class SingleNumber{
    public static void main(String[] args){
        int arr[]={2,2,1,7,1};
        int ans=singleNumber(arr);
        System.out.println(ans);
    }
    public static int singleNumber(int num[]){
        int value=0;
        for(int i=0;i<num.length;i++){
            value^=num[i];
        }
        return value;
    }
}