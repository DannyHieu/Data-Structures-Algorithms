package data_structure;


public class SinglyLinkedList {

    private ListNote head;

    private static class ListNote{
        private int data;
        private ListNote next;

        public ListNote(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNote(10);
        ListNote second = new ListNote(2);
        ListNote third = new ListNote(8);
        ListNote fourth = new ListNote(32);

        //kết nối note
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

    }
}
