public class RemoveElement {
    public static void main(String[] args) {
        int arr[]={0,1,2,4,1};
        int target=1;
        int ans=removeElement(arr,target);
        System.out.println(ans);
    }
    public static int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
