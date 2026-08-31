
 import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if (nums[i] + nums[i + 1] + nums[i + 2] > 0) break;
            if (nums[i] + nums[n - 2] + nums[n - 1] < 0) continue;
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                  if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    int lastLeft = nums[left], lastRight = nums[right];
                    while (left < right && nums[left] == lastLeft) left++;
                    while (left < right && nums[right] == lastRight) right--;
                } 
                else if (sum < 0) left++;
                else right--;
            }
        }
        return res;
    }
}