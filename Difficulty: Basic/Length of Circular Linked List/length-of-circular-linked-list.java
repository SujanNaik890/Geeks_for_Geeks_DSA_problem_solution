/* Linked List Node Structure
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    public static int getLength(Node head) {
        // code here
        Node temp=head;
        int length=1;
        if(head==null)return 0;
        while(temp.next!=head){
            length++;
            temp=temp.next;
        }
        return length;
    }
}