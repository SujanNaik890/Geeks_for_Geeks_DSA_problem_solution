/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        Node temp=head;
        Node prev=head;
    
        for(int i=1;i<=k;i++){
            if(temp==null)return -1;
            temp=temp.next;
        }
        while(temp!=null){
            prev=prev.next;
            temp=temp.next;
        }
        
        return prev.data;
        
    }
}