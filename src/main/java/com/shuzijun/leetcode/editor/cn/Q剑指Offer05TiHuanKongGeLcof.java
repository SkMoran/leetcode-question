  /**
请实现一个函数，把字符串 s 中的每个空格替换成"%20"。 

 

 示例 1： 

 输入：s = "We are happy."
输出："We%20are%20happy." 

 

 限制： 

 0 <= s 的长度 <= 10000 

 Related Topics 字符串 👍 555 👎 0

*/
  
  package com.shuzijun.leetcode.editor.cn;
  public class Q剑指Offer05TiHuanKongGeLcof{
      public static void main(String[] args) {
           Solution solution = new Q剑指Offer05TiHuanKongGeLcof().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String replaceSpace(String s) {
        if(s == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                sb.append("%20");
            }else{
                sb.append(s.charAt(i));
            }
        }
        return new String(sb);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }