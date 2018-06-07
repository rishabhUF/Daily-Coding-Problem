package GeeksForGeeks;

//Java program to check if all leaves are at same level

//A binary tree node
class Node 
{
 int data;
 Node left, right;

 Node(int item) 
 {
     data = item;
     left = right = null;
 }
}

class Leaf{
	int lastlevel = 0;
}
public class checkLeavesAtSameLevel {

	Node root;
    Leaf mylevel = new Leaf();
	public static void main(String args[]) 
    {
        // Let us create the tree as shown in the example
        checkLeavesAtSameLevel tree = new checkLeavesAtSameLevel();
        tree.root = new Node(12);
        tree.root.left = new Node(5);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(9);
        tree.root.left.left.left = new Node(1);
        tree.root.left.right.left = new Node(1);
        if (tree.checkLeaves(tree.root))
            System.out.println("Leaves are at same level");
        else
            System.out.println("Leaves are not at same level");
    }
	
	boolean checkLeaves(Node root){
		int level = 0;
		return checkUtils(root,level,mylevel);
	}
	
	boolean checkUtils(Node root, int level, Leaf myLevel){
		if(root == null) return true;
		if(root.left == null && root.right == null){
			if(myLevel.lastlevel == 0){
				myLevel.lastlevel = level;
				return true;
			}
			return myLevel.lastlevel == level;
		}
		return checkUtils(root.left, level+1,myLevel) && checkUtils(root.right,level+1,myLevel);
	}
}
