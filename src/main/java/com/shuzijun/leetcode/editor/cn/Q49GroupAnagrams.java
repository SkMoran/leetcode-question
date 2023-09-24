/**
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 * <p>
 * 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入: strs = [""]
 * 输出: [[""]]
 * <p>
 * <p>
 * 示例 3:
 * <p>
 * <p>
 * 输入: strs = ["a"]
 * 输出: [["a"]]
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= strs.length <= 10⁴
 * 0 <= strs[i].length <= 100
 * strs[i] 仅包含小写字母
 * <p>
 * <p>
 * Related Topics 数组 哈希表 字符串 排序 👍 1641 👎 0
 */

package com.shuzijun.leetcode.editor.cn;

import java.util.*;

public class Q49GroupAnagrams {
    public static void main(String[] args) {
        Solution solution = new Q49GroupAnagrams().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> list = new ArrayList<>();
            HashMap<String, List<String>> map = new HashMap<>();
            for (String str : strs) {
            char[] array = str.toCharArray();
                Arrays.sort(array);
                String key = new String(array);
                List<String> result = map.getOrDefault(key,new ArrayList<>());
                result.add(str);
                map.put(key,result);
            }
            return new ArrayList<>(map.values()) ;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}