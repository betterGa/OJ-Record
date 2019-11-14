//LeetCode429:二叉树的层序遍历
//执行用时 :4 ms，内存消耗 :46.6 MB。
// N叉树的层序遍历是很经典的广度优先搜索问题，要考虑的问题是本层的List如何设置。
// 先将队头入队，此时队列的size为1 ，这一层只有root一个节点，出队时需要将队头节点的值放入本层layerList，并使size--,
// 如果size=0，说明本层的结果已放入layerList，需要将layerList放入最终结果的集合result中，并且需要将本层list清空，开始放下一层
// （易错：如果这里先result.add(layerList)） 再layerList.clear()想用清除列表中元素
// clear()执行的操作是会执行循环将elementData中每一个坐标都设置为为null，
// 并设置数组的size为0。
// 而这样写的话一直用的是ArrayList类型的对象变量layerList，只用到了这一个引用，
// 它如果被清空，那么add到result集合中的layerList也是要被清空的，将导致例题结果将会是[[ ],[ ],[ ]])，
// 要想每到新的一层时该层layerList被清空，是应该使layerList指向一个新的空间，即layList=new ArrayList();
// 并且此时需要将队列的size赋给size，即可获得本层的节点数。 代码如下：

      package Search.BreadthFirstSearch.NaryTreeLevelOrderTraversal;
import java.util.*;


      // Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }

    public int getVal() {
        return val;
    }


    public void setVal(int val) {
        this.val = val;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }
};

 public class Solution {
        public List<List<Integer>> levelOrder(Node root) {
            if(root==null) return null;
Queue<Node> queue=new LinkedList<>();
//用来保存层次遍历结果
List result=new Vector();
//先让根进队
((LinkedList<Node>) queue).add(root);
int size=1;
//保存该层结果
            List layerlist=new Vector();

//当队不为空

            while (!queue.isEmpty()) {


                //队头出队
                Node head = queue.poll();

                layerlist.add(head.val);
                size--;
                if(head.children!=null)
                //队头的子树入队
                { for (Node children : head.children) {
                    queue.add(children);
                }}
                if (size == 0) {

                    result.add(layerlist);


               layerlist=new ArrayList();

                size = queue.size();}

            }
return result;
            }
        }






















