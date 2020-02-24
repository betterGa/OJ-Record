package NowCoder.Mirror;

import org.junit.Test;

import java.util.TreeSet;

import static org.junit.Assert.*;

public class SolutionTest {
Solution solution=new Solution();
TreeNode root=new TreeNode(8);
    TreeNode node2=new TreeNode(6);
    TreeNode node3=new TreeNode(10);
    TreeNode node4=new TreeNode(5);
    TreeNode node5=new TreeNode(7);
    TreeNode node6=new TreeNode(9);
    TreeNode node7=new TreeNode(11);
    @Test
    public void mirror() {

    }

    @Test
    public void mirror1() {
       root.left=node2;
       root.right=node3;
       node2.left=node4;
       node2.right=node5;
       node3.left=node6;
       node3.right=node7;
       solution.Mirror(root);
    }
}