package NowCoder.Mirror;

import java.util.TreeSet;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

/**
public class Solution {
    //递归
    public void Mirror(TreeNode root) {
        root = Mirror1(root);
    }

    public static TreeNode Mirror1(TreeNode root) {
        if(root.left==null&&root.right==null) return root;
        TreeNode newRoot = new TreeNode(root.val);
        newRoot.right = new TreeNode(root.left.val);
        newRoot.left = new TreeNode(root.right.val);
        if (root.left.left == null && root.left.right == null && root.right.left == null && root.right.right == null)
        {
            return newRoot;
        } else {
            newRoot.left = Mirror1(root.right);
            newRoot.right = Mirror1(root.left);
            return newRoot;
        }
    }
}

*/

public class Solution {
    public void Mirror(TreeNode root) {
if(root==null)return;
Mirror(root.left);
Mirror(root.right);
TreeNode temp=root.left;
root.left=root.right;
root.right=temp;
    }
}