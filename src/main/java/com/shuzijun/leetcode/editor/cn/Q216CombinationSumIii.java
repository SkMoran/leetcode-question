/**
 * 找出所有相加之和为 n 的 k 个数的组合，且满足下列条件：
 * <p>
 * <p>
 * 只使用数字1到9
 * 每个数字 最多使用一次
 * <p>
 * <p>
 * 返回 所有可能的有效组合的列表 。该列表不能包含相同的组合两次，组合可以以任何顺序返回。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * 输入: k = 3, n = 7
 * 输出: [[1,2,4]]
 * 解释:
 * 1 + 2 + 4 = 7
 * 没有其他符合的组合了。
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入: k = 3, n = 9
 * 输出: [[1,2,6], [1,3,5], [2,3,4]]
 * 解释:
 * 1 + 2 + 6 = 9
 * 1 + 3 + 5 = 9
 * 2 + 3 + 4 = 9
 * 没有其他符合的组合了。
 * <p>
 * 示例 3:
 * <p>
 * <p>
 * 输入: k = 4, n = 1
 * 输出: []
 * 解释: 不存在有效的组合。
 * 在[1,9]范围内使用4个不同的数字，我们可以得到的最小和是1+2+3+4 = 10，因为10 > 1，没有有效的组合。
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示:
 * <p>
 * <p>
 * 2 <= k <= 9
 * 1 <= n <= 60
 * <p>
 * <p>
 * Related Topics 数组 回溯 👍 756 👎 0
 */

package com.shuzijun.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class Q216CombinationSumIii {
    public static void main(String[] args) {
        Solution solution = new Q216CombinationSumIii().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        public List<List<Integer>> combinationSum3(int k, int n) {

            backTracking(n, k, 0, 1);
            return result;
        }

        void backTracking(int targetSum, int k, int sum, int startIndex) {
            if(path.size() == k){
                if (sum == targetSum) result.add(new ArrayList<>(path));
                return ;
            }
            for (int i = startIndex; i <=9 ; i++) {
                sum+=i;
                path.add(i);
                backTracking(targetSum,k,sum,i+1);
                sum-=i;
                path.remove(path.size()-1);
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}