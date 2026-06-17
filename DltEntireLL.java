public class LL5 {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void deleteEntireList() {
        head = null;
    }
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL5 list = new LL5();
        list.head = new Node(1);
        list.head.next = new Node(5);
        list.head.next.next = new Node(7);
        list.head.next.next.next = new Node(9);
        System.out.println("\tBefore deletion");
        list.printList();
        list.deleteEntireList();
        System.out.println("\tafter deletion");
        list.printList();
        //My info
        System.out.println("\nName: Syed Muhammad Ali Usman\n"+"Seat number: EB25210006095\n"+"Section A");
    }
}
