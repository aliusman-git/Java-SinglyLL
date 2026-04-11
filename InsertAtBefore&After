public class LL3 {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        //insertion after the node whose key value is 5;
    public void insertAfterNode(int key, int data) {
        Node newNode = new Node(data);
        Node current = head;
        while (current != null) {
            if (current.data == key)
                break;
            current = current.next;
        }
        if (current == null) {
            System.out.println(key + " not found!");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    //insertion before the node whose key value is 5
    public void insertBeforeNode(int key, int data) {
        Node newNode = new Node(data);
        if (head != null && head.data == key) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == key) 
                break;
            current = current.next;
        }
        if (current.next == null) {
            System.out.println(key + " not found");
            return; }
        newNode.next = current.next;
        current.next = newNode;

    }
    public void printlist(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data +" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LL3 list = new LL3();
        list.head = new Node(1);
        list.head.next = new Node(5);
        list.head.next.next = new Node(9);
        System.out.println("\tOriginal list");
        list.printlist();
        System.out.println("\n\tThe key value is 5\n");
        System.out.println("\tInsertion after node");
        list.insertAfterNode(5, 7);
        list.printlist();
        System.out.println("\tInsertion before node");
        list.insertBeforeNode(5, 3);
        list.printlist();
        //My info
        System.out.println("\nName: Syed Muhammad Ali Usman\n"+"Seat number: EB25210006095\n"+"Section A");

    }
}
