class LL1 {
        Node head;
        static class Node{
                int data;
                Node next;
                Node(int data){
                        this.data=data;
                        this.next=null;
                }
        }
        //Deletion at begining
        public void DeleteAtBeg(){
                if (head==null){
                        System.out.println("list is empty");
                        return;
                }
                head=head.next;
        }
        //Deletion At end
        public void DeleteAtEnd(){
                if (head==null){
                        System.out.println("list is empty");
                        return;
                } else if (head.next==null) {
                        head=null;
                        return;
                }else {
                        Node secondLast=head;
                        Node Last=head.next;
                        while(Last.next!=null){
                                secondLast=secondLast.next;
                                Last=Last.next;
                        }
                        secondLast.next=null;
                }
        }
        public void printList() {
                if (head==null){
                        System.out.println("list is empty");
                        return;
                }
                Node crrNode = head;
                while(crrNode != null  ){
                        System.out.print(crrNode.data + " -> ");
                        crrNode = crrNode.next;
                }
                System.out.println("null");
        }

        public static void main(String[] args) {
                LL1 List=new LL1();
                Node first=new Node(1);
                Node second=new Node(3);
                Node third=new Node(5);
                Node fourth=new Node(7);
                List.head=first;
                first.next=second;
                second.next=third;
                third.next=fourth;
                fourth.next=null;
                System.out.println("Original List");
                List.printList();
                System.out.println("\tDelete At Beginning");
                List.DeleteAtBeg();
                List.printList();
                System.out.println("\tDelete At End");
                List.DeleteAtEnd();
                List.printList();
                //My info
                System.out.println("\nName: Syed Muhammad Ali Usman\n"+"Seat number: EB25210006095\n"+"Section A");
        }
}
