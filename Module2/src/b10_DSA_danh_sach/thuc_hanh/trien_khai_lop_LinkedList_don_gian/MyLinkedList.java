package b10_DSA_danh_sach.thuc_hanh.trien_khai_lop_LinkedList_don_gian;

public class MyLinkedList {
    public class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }

    }
    private Node head;
    private int numberNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }
    public void add(int index,Object data){
        Node temp = head;

            for (int i=0;i<index&&temp.next!=null;i++){
                temp = temp.next;
            }
            Node random = temp.next;
            temp.next = new Node(data);
            temp.next.next = random;
            numberNodes++;
        }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numberNodes++;
    }
    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
