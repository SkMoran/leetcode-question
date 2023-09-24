/**
 * 给定一个不重复的整数数组 nums 。 最大二叉树 可以用下面的算法从 nums 递归地构建:
 * <p>
 * <p>
 * 创建一个根节点，其值为 nums 中的最大值。
 * 递归地在最大值 左边 的 子数组前缀上 构建左子树。
 * 递归地在最大值 右边 的 子数组后缀上 构建右子树。
 * <p>
 * <p>
 * 返回 nums 构建的 最大二叉树 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：nums = [3,2,1,6,0,5]
 * 输出：[6,3,5,null,2,0,null,null,1]
 * 解释：递归调用如下所示：
 * - [3,2,1,6,0,5] 中的最大值是 6 ，左边部分是 [3,2,1] ，右边部分是 [0,5] 。
 * - [3,2,1] 中的最大值是 3 ，左边部分是 [] ，右边部分是 [2,1] 。
 * - 空数组，无子节点。
 * - [2,1] 中的最大值是 2 ，左边部分是 [] ，右边部分是 [1] 。
 * - 空数组，无子节点。
 * - 只有一个元素，所以子节点是一个值为 1 的节点。
 * - [0,5] 中的最大值是 5 ，左边部分是 [0] ，右边部分是 [] 。
 * - 只有一个元素，所以子节点是一个值为 0 的节点。
 * - 空数组，无子节点。
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：nums = [3,2,1]
 * 输出：[3,null,2,null,1]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= nums.length <= 1000
 * 0 <= nums[i] <= 1000
 * nums 中的所有整数 互不相同
 * <p>
 * <p>
 * Related Topics 栈 树 数组 分治 二叉树 单调栈 👍 728 👎 0
 */

package com.shuzijun.leetcode.editor.cn;

import com.shuzijun.leetcode.editor.TreeNode;

public class Q654MaximumBinaryTree {
    public static void main(String[] args) {
        Solution solution = new Q654MaximumBinaryTree().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            return constructTree(nums, 0, nums.length);
        }

        public TreeNode constructTree(int[] nums, int leftIndex, int rightIndex) {
            // 左闭右开区间
            if (rightIndex - leftIndex < 1) {
                return null;
            }
            // 只有一个元素 返回该节点
            if (rightIndex - leftIndex == 1) {
                return new TreeNode(nums[leftIndex]);
            }
            int maxIndex = leftIndex;
            int maxVal = nums[leftIndex];
            for (int i = leftIndex; i < rightIndex; i++) {
                if (nums[i] > maxVal) {
                    maxVal = nums[i];
                    maxIndex = i;
                }
            }
            TreeNode root = new TreeNode(maxVal);
            root.left = constructTree(nums, leftIndex, maxIndex);
            root.right = constructTree(nums,maxIndex+1,rightIndex);
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}