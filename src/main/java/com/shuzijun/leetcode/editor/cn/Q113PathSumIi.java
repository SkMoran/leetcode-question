/**
 * 给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
 * <p>
 * 叶子节点 是指没有子节点的节点。
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
 * 输出：[[5,4,11,2],[5,8,4,5]]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = [1,2,3], targetSum = 5
 * 输出：[]
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：root = [1,2], targetSum = 0
 * 输出：[]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 树中节点总数在范围 [0, 5000] 内
 * -1000 <= Node.val <= 1000
 * -1000 <= targetSum <= 1000
 * <p>
 * <p>
 * Related Topics 树 深度优先搜索 回溯 二叉树 👍 1038 👎 0
 */

package com.shuzijun.leetcode.editor.cn;

import com.shuzijun.leetcode.editor.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q113PathSumIi {
    public static void main(String[] args) {
        Solution solution = new Q113PathSumIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {



        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            if(root == null){
                return new ArrayList();
            }
            List<List<Integer>> list = new ArrayList<>();
            List<Integer> path = new ArrayList<>();
            traversal(root, path, targetSum,root.val,list);
            return list;
        }
        }

        public void traversal(TreeNode node, List<Integer> path, int targetSum, int temp,List<List<Integer>> list) {

            if (node == null) {
                return;
            }
//            System.out.print(temp+" ");
            path.add(node.val);
//            System.out.print(node.val+" ");
//            System.out.println(path);
//            System.out.println(list);
            if (temp == targetSum && node.left == null && node.right == null) {
                System.out.println("temp == target "+temp);
                System.out.println("path:"+ path);
                List<Integer> list3 = new ArrayList<>(path);
                list.add(list3);
                System.out.println("added list"+list);
                return;
            }
            if(node.left!=null){
                traversal(node.left,path,targetSum,temp+node.left.val,list);
                path.remove(path.size()-1);

            }
            if(node.right!=null){
                traversal(node.right,path,targetSum,temp+node.right.val,list);
                path.remove(path.size()-1);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

