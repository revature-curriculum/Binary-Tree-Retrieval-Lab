public class BSTRetrival {

  static class Node {
    public int key;
    public Node left, right;

    public Node(int x) {
      key = x;
      // left = null;
      // right = null;
    }
  }

  static Node SearchBT(Node root, int key) {
    // TODO: Insert your logic here...
  }

  public static void main(String[] args) {

    Node root;
    // Given Tree:
    root = new Node(20);
    // left side
    root.left = new Node(12);
    root.left.left = new Node(7);
    root.left.right = new Node(16);
    // right side
    root.right = new Node(35);
    root.right.left = new Node(28);
    root.right.right = new Node(40);
    // Tree View
    /*            20
    *           /    \
    *        12        35
    *      /    \    /    \
    *     7     16  28     40
    */

    int key = /*TODO: Insert Node value to search for*/
    
    SearchBT(root,key);
    
  }
}
