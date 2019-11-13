package Search.BreadthFirstSearch.EmpolyeeImportance;

import java.util.*;

//深度优先搜索
//在LeetCode上超出时间限制

class Employee {

    public int id;

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

    public Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }

    public void setSubordinates(List<Integer> subordinates) {
        this.subordinates = subordinates;
    }

    public int importance;

    public List<Integer> subordinates;
}

public class Solution {

        public int getImportance(List<Employee> employees, int id) {
            if(employees==null) return 0;
            Queue<Employee> queue=new ArrayDeque<>();
            Map<Integer,Employee> map=new HashMap();
            for (Employee e:employees) {
                map.put(e.id,e);
            }

//先让该职员入队

       ((ArrayDeque<Employee>) queue).add(map.get(id));
            int sum=0;
            //当队列不为空时，由队头带出其下属
            while (!queue.isEmpty())
            {
                //获取队头重要性
                Employee teamHead=((ArrayDeque<Employee>) queue).peek();
             sum=sum+teamHead.importance;
       //队头的下属依次入队

                for(int i=0;i<teamHead.subordinates.size();i++)
                {
                 ((ArrayDeque<Employee>) queue).add(map.get(teamHead.subordinates.get(i)));
                }


               /*
                for (int i:teamHead.subordinates
                     ) {
                    ((LinkedList<Employee>) queue).push(map.get(i));
                }
*/



                //队头出队
                //如果先peek，再poll,就会出现超出时间限制
             ((ArrayDeque<Employee>) queue).poll();
            }
            return sum;
        }
}


























