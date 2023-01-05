package tk.amrom.leetcodetest;

public class Practice01 {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++){
            int temp = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] == target - nums[i]){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        Practice01 p = new Practice01();

        int[] arr = p.twoSum(nums, target);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        }


    }



