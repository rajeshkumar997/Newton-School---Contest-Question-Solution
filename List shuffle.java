/*

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        next = null;
    }
}
*/


public static Node Shuffle(Node head){
    //Enter your code here
    Node slow = head;
    Node fast = slow.next;
    boolean restricted = false;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    Node left=head;
    Node right=slow.next;
    slow.next=null;

    Node dummy = new Node(0);
    Node temp = dummy;
    while(left!=null || right!=null){
        if(left!=null){
            temp.next=left;
            temp=temp.next;
            left=left.next;
        }
        if(right!=null){
            temp.next=right;
            temp=temp.next;
            right=right.next;
        }
    }
    head =dummy.next;
    return head;
}
