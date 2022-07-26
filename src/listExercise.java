//definition for singly-linked list
class ListNode{
    int val;
    ListNode next;
    ListNode(){};
    ListNode(int val){this.val = val;}
    ListNode(int val,ListNode next){this.val = val;this.next = next;}
    public void add(int newVal){
        ListNode newNode = new ListNode(newVal);
        if(this.next==null)
            this.next = newNode;
        else
            this.next.add(newVal);
    }
    public void print(){
        System.out.print(this.val);
        if(this.next!=null){
            System.out.print("-->");
            this.next.print();
        }
    }
}
public class listExercise {
    public static void main(String[] args){
        ListNode head = new ListNode(-1);
        head.add(0);
        head.add(1);
        head.add(2);
        head.print();
    }
}
