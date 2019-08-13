/*
给定字符串和字典，判断字符串是否可以根据字典中的词分隔。
通过率90%，应该是因为字典中的词存在包含问题。




package DynamicProgrammer.WordBreak;

import java.util.Set;

public class Solution {

    public boolean wordBreak(String s, Set<String> dict) {

        String string = "";
        Object[] objects = dict.toArray();
        for (int m = 0; m < objects.length; m++) {
            string = string + objects[m];
        }
        if (string.equals(s)) {
            return true;
        } else {


            boolean[] judge = new boolean[100];
            judge[0] = true;
            int begin = 0;
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j <= i; j++) {
                    if (judge[j] == true) begin = j;
                }
                String temp = s.substring(begin, i + 1);
                if (dict.contains(temp)) {
                    judge[i + 1] = true;
                    judge[begin] = false;
                } else judge[i] = false;
            }
            if (judge[s.length()] == true) return true;
            else return false;
        }
    }

}

*/

package DynamicProgrammer.WordBreak;

import java.util.Set;

public class Solution {

    public boolean wordBreak(String s, Set<String> dict) {
      boolean[]judge=new boolean[s.length()+1];
      judge[0]=true;
for(int i=1;i<=s.length();i++)
    for(int j=0;j<i;j++)
    {if(judge[j]&&dict.contains(s.substring(j,i)))
    {judge[i]=true;
    }


    }

        return judge[s.length()];



    }}