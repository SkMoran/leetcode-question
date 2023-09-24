  /**
给定两个整数数组 inorder 和 postorder ，其中 inorder 是二叉树的中序遍历， postorder 是同一棵树的后序遍历，请你构造并返回
这颗 二叉树 。 

 

 示例 1: 
 
 
输入：inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
输出：[3,9,20,null,null,15,7]
 

 示例 2: 

 
输入：inorder = [-1], postorder = [-1]
输出：[-1]
 

 

 提示: 

 
 1 <= inorder.length <= 3000 
 postorder.length == inorder.length 
 -3000 <= inorder[i], postorder[i] <= 3000 
 inorder 和 postorder 都由 不同 的值组成 
 postorder 中每一个值都在 inorder 中 
 inorder 保证是树的中序遍历 
 postorder 保证是树的后序遍历 
 

 Related Topics 树 数组 哈希表 分治 二叉树 👍 1101 👎 0

*/
  
  package com.shuzijun.leetcode.editor.cn;

  import com.shuzijun.leetcode.editor.TreeNode;

  import java.util.HashMap;
  import java.util.Map;

  public class Q106ConstructBinaryTreeFromInorderAndPostorderTraversal{
      public static void main(String[] args) {
           Solution solution = new Q106ConstructBinaryTreeFromInorderAndPostorderTraversal().new Solution();
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
    Map<Integer,Integer> map ;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map = new HashMap<>();
        for(int i = 0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        return findNode(inorder,0,inorder.length,postorder,0,postorder.length);
    }

    public TreeNode findNode(int[] inorder,int inBegin,int inEnd,int[] postorder,int postBegin,int postEnd){
        // 参数范围左闭右开
        if(inBegin>=inEnd||postBegin>=postEnd){
            return null;
        }
        int rootIndex = map.get(postorder[postEnd-1]);
        // 创建节点
        TreeNode root = new TreeNode(inorder[rootIndex]);
        // 中序左区间的长度
        int lengthOfLeft = rootIndex - inBegin;
        root.left = findNode(inorder,inBegin,rootIndex,postorder,postBegin,postBegin+lengthOfLeft);
        root.right = findNode(inorder,rootIndex+1,inEnd,postorder,postBegin+lengthOfLeft,postEnd-1);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }