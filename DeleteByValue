public class LL6 {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.data == value) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == value)
                break;
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("\t  \""+value+"\"" + " not found");
            return;
        }
        current.next = current.next.next;
    }
    public void printList() {
        if (head == null) { System.out.println("List is empty!"); return; }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL6 list = new LL6();
        list.head = new Node(1);
        list.head.next = new Node(3);
        list.head.next.next = new Node(5);
        list.head.next.next.next = new Node(7);
        System.out.println("\tbefore deletion");
        list.printList();
        System.out.println("\tafter deletion of value:5");
        list.deleteByValue(5);
        list.printList();
        System.out.println("\tputting invalid value");
        list.deleteByValue(99);
        list.printList();
        //My info
        System.out.println("\nName: Syed Muhammad Ali Usman\n"+"Seat number: EB25210006095\n"+"Section A");
    }
}
