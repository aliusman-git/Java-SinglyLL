public class LL4 {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void deleteAtPosition(int position) {
        if (position < 1) { System.out.println("Invalid position!");
            return; 
     }
        if (head == null) { System.out.println("List is empty!"); 
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        Node current = head;
        int count = 1;
        while (count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            System.out.println("Position out of range!");
            return;
        }
        current.next = current.next.next;  
    }
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL4 list = new LL4();
        list.head = new Node(1);
        list.head.next = new Node(5);
        list.head.next.next = new Node(7);
        list.head.next.next.next = new Node(9);
        System.out.println("\toriginal list");
        list.printList();
        System.out.println("\tdelete node at position 3 (value 7)");
        list.deleteAtPosition(3);
        list.printList();
        //My info
        System.out.println("\nName: Syed Muhammad Ali Usman\n"+"Seat number: EB25210006095\n"+"Section A");
        }
}
