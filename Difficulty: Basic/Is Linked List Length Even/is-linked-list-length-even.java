/* structure of link list node
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    public boolean isEven(Node head) {
        // code here
        int length=0;
        if(head==null) return true;
        Node temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        return length%2==0?true:false;
    }
}