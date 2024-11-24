package data_structure;


public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    private int length() {
        if (head == null) return 0;
        int count = 0;
        ListNode current = head;

        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    private void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    private void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
             current = current.next;
        }
        current.next = newNode;
    }

    private void insertAt(int value, int position) {
        ListNode node = new ListNode(value);
        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position -1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }

    }

    private void deleteFirst() {
        if (head == null) return;

        ListNode temp = head;
        head = head.next;
        temp.next = null;

//        return temp;
    }

    private void deleteLast() {
        if (head == null || head.next == null) return;
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;

    }

    private void deleteAt(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position -1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }


    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(32);

        //kết nối note
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();
//        System.out.println(sll.length());

        sll.insertFirst(11);
        sll.display();

        sll.insertLast(4);
        sll.display();

        sll.insertAt(20, 3);
        sll.display();

        sll.deleteFirst();
        sll.display();

        sll.deleteLast();
        sll.display();

        sll.deleteAt(3);
        sll.display();
    }
}
