class Node{
    public int val;
    public Node next;
    //constructor
    Node(int val){
        this.val=val;
        this.next=null;
    }
}
public class Linked {
    public static Node insertAtHead(Node currhead, Node newNode){
        //1. point the next of newNode to currhead
        newNode.next=currhead;
        //2. point head to newNode
      //  currhead=newNode;
      return newNode;
        
    }
    public static void main(String[] args){
            Node head = new Node( val: 1 ); //head of linked list
            Node newNode = new Node( val: 2 );
            System.out.println(head.val);
          head = insertAtHead(head,newNode);
           System.out.println(head.val);
    }
}