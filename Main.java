class Main {
  public static treeNode successor(treeNode n){
    if(n.right!=null){ //if node has a right child, then next successor is leftmost node of right subtree
      n=n.right;
      while(n.left!=null){
        n=n.left;
      }
      return n;
    }
    while(n.parent!=null){//if node has no children, then the next successor is the first parent to the right from node.
      treeNode x =n;
      if (x!=n.parent.left){
        n=n.parent;
      }
       else return n.parent;
    }
    return null;// There is no successor for the given node.
  }
  public static void main(String[] args) {
    treeNode root = new treeNode(10);
    treeNode a = new treeNode(5);
    treeNode b = new treeNode (15);
    treeNode c = new treeNode(7);
    treeNode d = new treeNode(12);
    treeNode e = new treeNode(6);
    treeNode f = new treeNode(13);
    // Binary search tree
    root.left =a; root.right =b;
    a.parent = root; a.right =c;
    b.parent = root; b.left =d;
    c.parent =a; c.left = e; 
    d.parent =b; d.right =f; 
    e.parent =c; 
    f.parent=d; 

    System.out.println("The Next successor for node 6 is: " +successor(e).data);
    System.out.println("The Next successor for node 7 is: "+successor(c).data);
    System.out.println("The Next successor for node 12 is: "+successor(d).data);
  }
}