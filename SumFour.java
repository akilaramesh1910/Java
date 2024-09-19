
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumFour {
    public static void main(String[] args) {
        int nums[]= {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(FindSum(nums, target));
    }
    public static List<List<Integer>> FindSum(int nums[], int target) {

        List<List<Integer>> list = new ArrayList<>();

        if(nums == null || nums.length < 4){
            return list;
        }

        Arrays.sort(nums);

        for(int i = 0; i < nums.length-3; i++){

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j = i + 1; j < nums.length-2; j++) {
                if(j > i + 1 && nums[j] == nums[j-1]){
                    continue;
                }

                int k = j + 1; 
                int l = nums.length - 1;

                while(k < l){
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];

                    if(sum == target){
                        list.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));

                        while(k < l && nums[k] == nums[k+1]){
                            k++;
                        }
                        while(k < l && nums[l] == nums[l-1]){
                            l--;
                        }
                        k++;
                        l--;
                    }
                    else if(sum < target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }
        return list;
    }
}
