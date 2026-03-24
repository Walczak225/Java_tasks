package Task01;

import java.util.ArrayList;

public class ListNode {
    int val; // wartosc liczby
    public ListNode next;

    public ListNode (int val){
        this.val = val;
    }

    public static ListNode mergeTwoLists (ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 == null){
            current.next = list1;
        }else  current.next = list2;

        return dummy.next;
    }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }
        System.out.println();
    }
}

