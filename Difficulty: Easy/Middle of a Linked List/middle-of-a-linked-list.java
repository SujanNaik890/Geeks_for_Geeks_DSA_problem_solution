/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        int length=0;
        if(head==null)return 0;
        Node temp=head;
        
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        temp=head;
        for(int i=0;i<length/2;i++){
            temp=temp.next;
        }
        return temp.data;
    }
}