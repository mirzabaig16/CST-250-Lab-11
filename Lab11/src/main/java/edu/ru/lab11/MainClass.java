
package edu.ru.lab11;


public class MainClass {

    public static void main(String[] args) 
    {
      Node root = new Node(15);
      root.left = new Node(20);
      root.right = new Node (12);
      root.left.left = new Node (10);
      root.left.left.right = new Node (30);
      root.left.right = new Node (10);
      root.left.left.left = new Node (15);
      
    }
    
}
