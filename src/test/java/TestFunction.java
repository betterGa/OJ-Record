import org.junit.Assert;
import org.junit.Test;

import java.util.*;

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
        Object[] data1 = data.toArray();
        System.out.println(data1[0]);
        System.out.println(data1[1]);
        String str = new String();
        for (int n = 0; n < data1.length; n++) {
            str = str + data1[n];
        }
        System.out.println(str);
    }

    @Test
    public void test2() {
        char[] a = new char[2];
        System.out.println(a[0]);
    }

    @Test
    public void test3() {
        System.out.println(10 << 2);
        System.out.println(Math.pow(3, 2));
    }

    @Test
    public void test4() {
        String result = "leetcode";
        Assert.assertEquals("", result.substring(0, 0));
    }

    @Test
    public void test5() {
        ArrayList<Integer> in = new ArrayList();
        in.add(2);
        ArrayList<Integer> in2 = new ArrayList();
        in2.add(3);
        in2.add(4);
        ArrayList<Integer> in3 = new ArrayList();
        ArrayList<ArrayList<Integer>> out = new ArrayList();
        out.add(in);
        out.add(in2);
        System.out.println(out.get(1).get(0));

    }

    @Test
    public void test6() {
        int[][] w = new int[][]{{0}};
        System.out.println(w.length);//m
        System.out.println(w[0].length);//n

    }

    @Test
    public void test7() {
        System.out.println("".length());
    }

    @Test
    public void test8() {
        while (true) {
            System.out.println("ohh");
            return;
        }
        //return有两个作用：1. 返回方法指定类型的值。
        //                      2.直接结束方法的调用
    }


    class Employee {
        public int id;
        public int importance;

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", importance=" + importance +
                    ", subordinates=" + subordinates +
                    '}';
        }


        public List<Integer> subordinates;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getImportance() {
            return importance;
        }

        public void setImportance(int importance) {
            this.importance = importance;
        }

        public List<Integer> getSubordinates() {
            return subordinates;
        }

        public void setSubordinates(List<Integer> subordinates) {
            this.subordinates = subordinates;
        }
    }

    @Test
    public void test9() {
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setImportance(5);
        List<Integer> s1 = new ArrayList();
        s1.add(2);
        s1.add(3);
        employee1.subordinates = s1;
//System.out.println(employee1);

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setImportance(3);
        List<Integer> s2 = new ArrayList();
        employee2.subordinates = s2;

        Employee employee3 = new Employee();
        employee3.setId(3);
        employee3.setImportance(3);
        List<Integer> s3 = new ArrayList();
        employee3.setSubordinates(s3);

        List<Employee> employees = new ArrayList();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        System.out.println(employees);
    }

    @Test
    public void test10() {
        List<String> ten = new ArrayList();
        int sr = 1;
        int sc = 1;
        int sr1 = 0;
        int sc1 = 1;
        ten.add(sr + "" + sc);
        ten.add(sr1 + "" + sc1);
        System.out.println(ten);
        ten.remove(sr1 + "" + sc1);
        System.out.println(ten);

    }

    @Test
    public void test11() {
        String s = "123";
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 58 || a[i] < 47) {
                System.out.println("仅由数字");
            }
        }


    }
    class user
    {private String name;
    private int pass;
    }
    @Test
    public void test12()
{user u=new user();
u.name="jia";
u.pass=1;
    ArrayList a=new ArrayList();
    a.add(u);
    System.out.println(
            a.contains(1)
    );



}

@Test
    public void test13()
{
    char a='a';
    System.out.println(a=='a');
}

@Test
    public void testSb()
{
    StringBuilder sb=new StringBuilder("abcdef");
   // sb.insert(0,"o");
    sb.insert(6,"h");
System.out.println(sb);

}

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
    // int[]list=new int[num];
     ArrayList list=new ArrayList(num);
        int i=0;
      for (int j=0;j<num;j++)
        {
           list.add(in.nextInt()) ;
        }
        for(int j=0;j<list.size();j++)
        System.out.println(list);
    }
    @Test
    public void test14()
    {int i=0+'9';
    int j=0+'0';
        System.out.println(i);
System.out.println(j);
System.out.println(Character.valueOf('0'));
    }
@Test
    public void test15()
{System.out.println("0123456".substring(2,7));}

@Test
    public void test16()
{ArrayList<Integer> arrayList=new ArrayList<>(5);
arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(4);
    arrayList.add(5);
    arrayList.remove(0);
    System.out.println(arrayList);
    System.out.println("size="+arrayList.size());
}
@Test
    public void test17()
{
    String s="01234";
    System.out.println(s.substring(5,5));
}
@Test
    public void test18()
{
    int i=1;
    char a='1';
    char b='0';
    char c=(char) '0'+1;
    System.out.print(c);
    //System.out.print(1);
   // System.out.print(a);
}
}

