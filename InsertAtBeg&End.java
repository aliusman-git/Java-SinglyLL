class LL{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next =null;
        }
    }

    //insert at beginning
    public void InsertAtBeg(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //insert at end
    public void InsertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head =newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next =newNode;
    }
    //print
    public void PrintList(){
        Node currNode=head;
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        while(currNode!=null){
            System.out.print(currNode.data+ " -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        LL List=new LL();
        List.InsertAtBeg(7);
        List.InsertAtBeg(5);
        List.PrintList();
        System.out.println("\tInsertion At Begining");
        List.InsertAtBeg(3);
        List.InsertAtBeg(1);
        List.PrintList();

        System.out.println("\tInsertion At End");
        List.InsertAtEnd(9);
        List.InsertAtEnd(11);
        List.PrintList();
        //My info
        System.out.println("\nName: Syed Muhammad Ali Usman\n"+"Seat number: EB25210006095\n"+"Section A");
    }
}
