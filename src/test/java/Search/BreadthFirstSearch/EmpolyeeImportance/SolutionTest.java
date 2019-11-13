package Search.BreadthFirstSearch.EmpolyeeImportance;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution=new Solution();
    List list1=new ArrayList();
List list2=new ArrayList();

    @Test
    public void getImportance() {

list1.add(2);
list1.add(3);
        Employee employee1=new Employee(1,5,list1);
        Employee employee2=new Employee(2,3,list2);
        Employee employee3=new Employee(3,3,list2);

        List<Employee> employees=new ArrayList();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        System.out.println(solution.getImportance(employees,1));

    }
}