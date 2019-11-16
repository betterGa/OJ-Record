package Search.BreadthFirstSearch.NaryTreeLevelOrderTraversal;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution=new Solution();
    List<Node> rootlist=new ArrayList();
    List<Node> list1=new ArrayList();
    List<Node> list2=new ArrayList<>();
Node node2=new Node(2,null);
Node node3=new Node(4,null);
Node node4=new Node(5,null);
Node node5=new Node(6,null);
    @Test
    public void levelOrder() {
        Node node1=new Node(3,list2);
        list1.add(node1);
        list1.add(node2);
        list1.add(node3);
        list2.add(node4);
        list2.add(node5);
        Node root=new Node(1,list1);

        System.out.println(solution.levelOrder(root));
    }
}