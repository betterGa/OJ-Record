package Search.DeepthFirstSearch.EmpolyeeImportance;

import java.util.ArrayList;
import java.util.List;

/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
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

    public void setSubordinates(List<Integer> subordinates) {
        this.subordinates = subordinates;
    }

    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
}






public class Solution {

    public List<Employee> Assign()
    {  Employee employee1=new Employee();
        employee1.setId(1);
        employee1.setImportance(5);
        List<Integer>s1=new ArrayList();
        s1.add(2);
        s1.add(3);
        employee1.subordinates=s1;
//System.out.println(employee1);

        Employee employee2=new Employee();
        employee2.setId(2);
        employee2.setImportance(3);
        List<Integer>s2=new ArrayList();
        employee2.subordinates=s2;

        Employee employee3=new Employee();
        employee3.setId(3);
        employee3.setImportance(3);
        List<Integer>s3=new ArrayList();
        employee3.setSubordinates(s3);

        List<Employee>employees=new ArrayList();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
    return employees;}




        public int getImportance(List<Employee> employees, int id) {
            //设置数组，用于标记重要性是否被加,若值为0，说明没被加过；否则被加过
            int length=employees.size();
            //int[]ifAdd=new int[length];
            int sum=0;
//先找到输入的ID对应的员工
            for(int i=0;i<employees.size();i++)
            {if(employees.get(i).id==id)
            //对应的员工为e
            { Employee e=employees.get(i);
                    sum=sum+e.importance;
                for(int j=0;j<e.subordinates.size();j++)
                { sum=sum+getImportance(employees,e.subordinates.get(j));}
            }
            }
            return sum;
        }
    }






