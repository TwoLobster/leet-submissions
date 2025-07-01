/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList <Integer> list1=new LinkedList<>();
        LinkedList <Integer> list2=new LinkedList<>();
        while(l1!=null){
            list1.add(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            list2.add(l2.val);
            l2=l2.next;
        }
        LinkedList<Integer> list3=new LinkedList<>();
        Iterator<Integer> rev1=list1.descendingIterator();
        Iterator<Integer> rev2=list2.descendingIterator();

        int carry=0;
        while(rev1.hasNext() || rev2.hasNext() || carry!=0){
            int val1=rev1.hasNext()?rev1.next():0;
            int val2=rev2.hasNext()?rev2.next():0;
            int sum=val1+val2+carry;
            list3.addFirst(sum%10);
            carry=sum/10;
        }
        ListNode head=convert(list3);
        return head;
    }
    private ListNode convert(LinkedList<Integer> list){
       ListNode head=new ListNode(0);
       ListNode current=head;
       for(int val:list){
        current.next=new ListNode(val);
        current=current.next;
       }
       return head.next;
    }
}