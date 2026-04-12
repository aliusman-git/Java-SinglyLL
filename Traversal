public class LL7 {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        //Printing entire list
    public void printList() {
        if (head == null) { System.out.println("List is empty!");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
            //searchin for
    public void search(int key) {
        if (head == null) { System.out.println("List is empty!");
            return;
        }
        Node current = head;
        int position = 1;
        while (current != null) {
            if (current.data == key) {
                System.out.println("Found " + key + " at position " + position);
                return;
            }
            current = current.next;
            position++;
        }
        System.out.println("\t  \""+key+"\"" + " not found");
    }
        //calculating length
    public int length() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LL7 list = new LL7();
        list.head = new Node(1);
        list.head.next = new Node(3);
        list.head.next.next = new Node(5);
        list.head.next.next.next = new Node(7);
        System.out.println("\tprinting entire list");
        list.printList();
        System.out.println("\tsearching valid value");
        list.search(7);
        System.out.println("\tsearching invalid value");
        list.search(99);
        System.out.println("Length = " + list.length());
        //My info
        System.out.println("\nName: Syed Muhammad Ali Usman\n"+"Seat number: EB25210006095\n"+"Section A");
    }
}
