package Search.DeepthFirstSearch.EmpolyeeImportance;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
Solution solution=new Solution();
List<Employee> employees=solution.Assign();
    @Test
    public void getImportance() {
int result=solution.getImportance(employees,1);
        Assert.assertEquals(11,result);
    }
}