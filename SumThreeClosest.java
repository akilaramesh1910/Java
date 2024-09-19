
import java.util.Arrays;

public class SumThreeClosest {
    public static void main(String[] args) {
        int nums[] = {-1,2,1,-4};
        int target = 1;
        System.out.println(Find(nums, target));
    }
    public static int Find(int[] nums, int target) {

        Arrays.sort(nums);

        int closetSum = nums[0] + nums[1] + nums[2];

        for(int i = 0; i< nums.length-2; i++){
            int j = i + 1;
            int k = nums.length - 1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == target){
                    return sum;
                }

                if(Math.abs(sum - target) < Math.abs(closetSum - target)){
                    closetSum = sum;
                }

                if(sum < target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return closetSum;
        
    }
}
