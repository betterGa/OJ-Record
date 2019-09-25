
//合法括号序列判断
//链接：https://www.nowcoder.com/questionTerminal/d8acfa0619814b2d98f12c071aef20d4?toCommentId=4300493
//来源：牛客网
//
//首先，如果字符串长度为奇数，一定是非法序列，返回false;
// 栈解决括号匹配问题，遇到左括号进栈，遇到右括号时，如果栈为空，说明右括号多余了，返回false,
// 如果栈不为空，出栈，说明这时的右括号与出栈的这个左括号匹配，如果遍历完字符串，栈为空，说明匹配完毕，
// 否则说明左括号有多余，返回false。
package NowCoder;
//合法括号串判断
import java.util.*;
public class Parenthesis {

    public boolean chkParenthesis(String A, int n) {
        if(n%2==1){ return false;}

        /*if(n==1&&(A.equals("(")||A.equals(")")))
        return true;*/
else { Stack stack=new Stack();
    char[] data=A.toCharArray();
            for (char c:data) {
if(c=='(') stack.push(c);
if(c==')'&&stack.isEmpty())return false;
if(c==')'&&(!stack.isEmpty())) stack.pop();}
            if(stack.isEmpty())
            return true;}
return false;
    }}





