/**
 * 给你一个正整数 n ，生成一个包含 1 到 n² 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：n = 3
 * 输出：[[1,2,3],[8,9,4],[7,6,5]]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：n = 1
 * 输出：[[1]]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= n <= 20
 * <p>
 * <p>
 * Related Topics 数组 矩阵 模拟 👍 1143 👎 0
 */

package com.shuzijun.leetcode.editor.cn;

public class Q59SpiralMatrixIi {
    public static void main(String[] args) {
        Solution solution = new Q59SpiralMatrixIi().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] generateMatrix(int n) {
            int loop = 0;
            int[][] arr = new int[n][n];
            int start = 0;
            int count = 1;
            int x = 0, y = 0;

            while(loop<n/2){
                for(y=start;y<n-loop;y++){
                    arr[start][y]=count++;
                }


                loop++;
            }

            return arr;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}