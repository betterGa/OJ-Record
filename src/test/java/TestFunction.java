import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class TestFunction {
    @Test
    public void test() {
        String str = "aaaaaaa";
        System.out.println(str.substring(0, 1));
    }

    @Test
    public void test1() {
        Set<String> data = new HashSet<String>();
        data.add("leet");
        data.add("code");
      Object[]data1=data.toArray();
      System.out.println(data1[0]);
      System.out.println(data1[1]);
      String str=new String();
      for(int n=0;n<data1.length;n++)
      {str=str+data1[n]; }
      System.out.println(str);
      }

    @Test
    public void test2()
    {char []a=new char[2];
    System.out.println(a[0]);
    }
}