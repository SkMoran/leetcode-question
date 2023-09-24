/**
 * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
 * <p>
 * 你可以按 任何顺序 返回答案。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：n = 4, k = 2
 * 输出：
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：n = 1, k = 1
 * 输出：[[1]]
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= n <= 20
 * 1 <= k <= n
 * <p>
 * <p>
 * Related Topics 回溯 👍 1493 👎 0
 */

package com.shuzijun.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class Q77Combinations {
    public static void main(String[] args) {
        Solution solution = new Q77Combinations().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        public List<List<Integer>> combine(int n, int k) {
            backTracking(n,k,1);
            return result;
        }

        void backTracking(int n, int k, int startIndex) {
            if (path.size() == k) {
                result.add(new ArrayList<>(path));
                return;
            }
            for (int i = startIndex; i <= n; i++) {
            path.add(i);
            backTracking(n,k,i+1);
            path.remove(path.size()-1);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}