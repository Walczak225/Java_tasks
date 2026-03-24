import Task01.ListNode;

import static Task01.ListNode.mergeTwoLists;
import static Task01.ListNode.printList;

public class Main {
    static void main() {
        ListNode listNode = new ListNode(2);

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        System.out.print("Lista 1: ");
        printList(list1);
        System.out.print("Lista 2: ");
        printList(list2);

        ListNode result = mergeTwoLists(list1, list2);

        System.out.print("Wynik połączenia: ");
        printList(result);

    }
}
