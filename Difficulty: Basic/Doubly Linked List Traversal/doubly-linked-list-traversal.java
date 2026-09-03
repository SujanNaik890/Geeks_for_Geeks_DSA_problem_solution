/* Structure of doubly linked list Node
class Node {
  public int data;
  public Node next;
  public Node prev;

  public Node(int x) {
      data = x;
      next = null;
      prev = null;
  }
};*/
class Solution {
    public List<List<Integer>> displayList(Node head) {
        // code here
        List<List<Integer>>list=new ArrayList<>();
       List<Integer> list1 = new ArrayList<>();
       List<Integer> list2 = new ArrayList<>();
       Node temp=head;
       Node tail=null;
       while(temp!=null){
           list1.add(temp.data);
           tail=temp;
           temp=temp.next;
       }
       temp=tail;
       while(temp!=head.prev){
           list2.add(temp.data);
           temp=temp.prev;
       }
       list.add(list1);
       list.add(list2);
       return list;
    }
}