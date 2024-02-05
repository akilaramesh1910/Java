package Array1D;

public class ArrayPresent {
    public static void main(String[] args){
        int[] arr={10,20,100,54,10};
        int key=8;
        boolean find=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                find=true;
                break;
            }
        }
        if(find==true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
