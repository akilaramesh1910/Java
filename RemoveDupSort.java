import java.util.Scanner;

public class RemoveDupSort {
    public static void main(String[] args){
        int num[]={1,3,3,2,2,2};
        int ans=removeDuplicates(num);
        System.out.println(ans);
    }
    public static int removeDuplicates(int[] nums) {
          
        if(nums.length==0){
            return 0;
        }
        int value=0;
        for(int i=1;i<nums.length;i++){
            if(nums[value]!=nums[i]){
                value++;
                nums[value]=nums[i];
            }
        }
        return value+1;
    }
}
