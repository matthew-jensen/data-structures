import java.util.Random;

class Sorting {

    public static void main(String[] args) {
        ListNode head = randomList(5);
        //printList(); 
        ListNode insert = new ListNode(50000);
        insertNode(head, insert);
    }

    private static ListNode randomList(int size) {
        Random random = new Random();
        ListNode head = new ListNode(random.nextInt(500) + 1); 
        ListNode cur = head;
        for(int i = 0; i < size; i++) {
            cur.next = new ListNode(random.nextInt(500) + 1);
            cur = cur.next;
        }
        return head;
    }
    private static void printList(ListNode head) {
        ListNode cur = head; 
        System.out.print("[ " + cur.data);
        cur = cur.next;
        while( cur != null ) {
            System.out.print(" -> " + cur.data);
            cur = cur.next;
        } 
        System.out.println(" ]");
    }
    private static void insertNode(ListNode preceeding, ListNode inserting) {
        inserting.next = preceeding.next;
        preceeding.next = inserting;
    }

    private static void insertionSort(ListNode head) {

    }

    private static void quickSort(ListNode head) {
        int first = 0;
        int last = 0;
        
        if( first < last) {

        }
        ListNode fake = new ListNode(-1);
        fake.next = head;
    }
}
