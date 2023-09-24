/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：digits = ""
 * 输出：[]
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：digits = "2"
 * 输出：["a","b","c"]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 0 <= digits.length <= 4
 * digits[i] 是范围 ['2', '9'] 的一个数字。
 * <p>
 * <p>
 * Related Topics 哈希表 字符串 回溯 👍 2627 👎 0
 */

package com.shuzijun.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class Q17LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        Solution solution = new Q17LetterCombinationsOfAPhoneNumber().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<String> path = new ArrayList<>();
        List<String> result = new ArrayList<>();

        public List<String> letterCombinations(String digits) {
            String[] strs = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

            return null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}