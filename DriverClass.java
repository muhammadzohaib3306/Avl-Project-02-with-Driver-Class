package trees;


public class DriverClass {
    public static void main(String[] args) {
        BinaryTree b=new BinaryTree(1);
      
        
        b.leftChild=new BinaryTree(2);
        b.rightChild=new BinaryTree(3);
       b.leftChild.leftChild=new BinaryTree(4);
        b.leftChild.rightChild=new BinaryTree(5);
       
  
        System.out.println("The size of binary tree is = ");
        System.out.println(  b.size());
        System.out.println("The balance of binary tree is = ");
         System.out.println( b.balance());
         System.out.println("The height of binary tree is = ");
        System.out.println(  b.height());
     
        
//        b.insert(2);
//        b.insert(3);
//              b.insert(4);
//                    b.insert(5);
      
      
        System.out.println("Preorder traversal of binary tree is ");
        System.out.println(b.nlr());
      
        System.out.println("");
          System.out.println("Inorder traversal of binary tree is ");
           System.out.println(b.lnr());
                  System.out.println("");
        System.out.println("Postorder traversal of binary tree is ");
             System.out.println(b.lrn());
                 System.out.println("");
                  System.out.println("Breadth-first traversal of binary tree is ");
                    System.out.println(   b.bfs());
//        System.out.println(b.data);
//        System.out.println(b.leftChild.data);
//        System.out.println(b.rightChild.data);
        
 // BinaryTree b=new BinaryTree(item);
    }
    static    void printPostorder(BinaryTree node) 
    { 
        if (node == null) 
            return; 
  
        // first recur on left subtree 
        printPostorder(node.leftChild); 
  
        // then recur on right subtree 
        printPostorder(node.rightChild); 
  
        // now deal with the node 
        System.out.print(node.data + " "); 
    } 
          static   void printInorder(BinaryTree node) 
    { 
        if (node == null) 
            return; 
  
        /* first recur on left child */
        printInorder(node.leftChild); 
  
        /* then print the data of node */
        System.out.print(node.data + " "); 
  
        /* now recur on right child */
        printInorder(node.rightChild); 
    } 
  
    /* Given a binary tree, print its nodes in preorder*/
      static   void printPreorder(BinaryTree node) 
    { 
        if (node == null) 
            return; 
  
        /* first print data of node */
        System.out.print(node.data + " "); 
  
        /* then recur on left sutree */
        printPreorder(node.leftChild); 
  
        /* now recur on right subtree */
        printPreorder(node.rightChild); 
    } 
}
















