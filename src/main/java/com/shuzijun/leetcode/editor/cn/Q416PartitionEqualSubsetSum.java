/**
 * 给你一个 只包含正整数 的 非空 数组 nums 。请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：nums = [1,5,11,5]
 * 输出：true
 * 解释：数组可以分割成 [1, 5, 5] 和 [11] 。
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：nums = [1,2,3,5]
 * 输出：false
 * 解释：数组不能分割成两个元素和相等的子集。
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= nums.length <= 200
 * 1 <= nums[i] <= 100
 * <p>
 * <p>
 * Related Topics 数组 动态规划 👍 1889 👎 0
 */

package com.shuzijun.leetcode.editor.cn;

public class Q416PartitionEqualSubsetSum {
    public static void main(String[] args) {
        Solution solution = new Q416PartitionEqualSubsetSum().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canPartition(int[] nums) {
            int sum = 0;
            for (int i : nums) {
                sum += i;
            }
            if (sum % 2 != 0) {
                return false;
            }
            int target = sum/2;
            int[] dp = new int[target+1];

            for (int i = 0; i < nums.length; i++) {
                for (int j = target; j >= nums[i] ; j--) {
                    dp[j]=Math.max(dp[j],dp[j-nums[i]]+nums[i]);
                }
            }
            if(dp[target] == target){
                return true;
            }
            return false;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}