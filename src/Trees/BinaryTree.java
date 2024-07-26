package Trees;

import java.util.Scanner;

public class BinaryTree {
public BinaryTree(){
}
class Node{
    int value;
    Node left;
    Node right;
    public Node(int value){
        this.value=value;
    }
}
private Node root ;
//insert element
public void populate(Scanner scanner){
    System.out.println("Enter the root Node :");
    int value = scanner.nextInt();
    root = new Node(value);
    populate(scanner,root);
}
private void populate(Scanner sc,Node node){
    System.out.println("Do you want to enter on the left of "+node.value);
    Boolean  left = sc.nextBoolean();
    if(left){
        System.out.println("Enter the value of the left of "+node.value);
        int value = sc.nextInt();
        node.left = new Node(value);
        populate(sc,node.left);
    }

    System.out.println("Do you want to enter on the right of "+node.value);
    Boolean  right = sc.nextBoolean();
    if(right){
        System.out.println("Enter the value of the right of "+node.value);
        int value = sc.nextInt();
        node.right = new Node(value);
        populate(sc,node.right);
    }
}
public void display(){
    display(root,"");
}
private void display(Node node, String indent){
    if(node==null){
        return;
    }
    System.out.println(indent+node.value);
    display(node.left,indent+"\t");
    display(node.right,indent+"\t");

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.display();
        tree.prettyDisplay();
        tree.inOrder();
    }
    public void prettyDisplay(){
    prettyDisplay(root,0);
    }
    private void prettyDisplay(Node node, int level){
    if(node==null){
        return;
    }
    prettyDisplay(node.right,level+1);
    if(level!=0){
        for(int i=0; i<level-1; i++){
            System.out.print("|\t\t");
        }
        System.out.println("|----------"+node.value);
    }
    else{
        System.out.println(node.value);
    }
    prettyDisplay(node.left,level+1);
    }

    public void preOrder(){
    preOrder(root);
    }
    public void preOrder(Node node){
    if(node == null){
        return;
    }
    System.out.println(node.value+" ");
    preOrder(node.left);
    preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(Node node){
        if(node == null){
            return;
        }
        preOrder(node.left);
        System.out.println(node.value+" ");
        preOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    public void postOrder(Node node){
        if(node == null){
            return;
        }

        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.value+" ");
    }
}
