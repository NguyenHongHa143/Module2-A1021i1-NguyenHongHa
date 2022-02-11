package b10_DSA_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_LinkedList;

public class MyLinkedList<E> {
    public class Node{
        private Node next;
        private Object data;

        public Node (Object data) {
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }
    private Node head;
    private int numberNode;

    public MyLinkedList() {
    }
//    Phuong thuc addFirst
    public void addFirst(E element){
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numberNode++;
    }
//    Phuong thuc addLast
    public void addLast(E element){
        Node temp = head;
        while (temp.next!= null){
            temp = temp.next;
        }
        temp.next = new Node(element);
        numberNode++;
    }
//    Phuong thuc add vi tri chi dinh
    public void add(int index,E element){
        if (index<0||index>numberNode){
            System.out.println("loi");
        }
        else {
            int count=1;
            Node curent=head;
            Node temp = head;
            while (count<index && curent!=null){
                curent = curent.next;
                count++;
            }
            temp = curent.next;
            curent.next = new Node(element);
            curent.next.next=temp;
            numberNode++;
        }
    }
//    phuong thuc get() vi tri chi dinh
    public Object get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp.data;
    }
//    phuong thuc size()
    public int size(){
        return numberNode;
    }
//    phuong thuc remove()
    public E remove(int index) {
        if (index < 0 || index > numberNode) {
            throw new IllegalArgumentException("Error index " + index);
        }
        Node temp = head;
        Object data;
        if (index == 0) {
            data = temp;
            head = head.next;
            numberNode--;

        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numberNode--;
        }
        return (E) data;
    }
//    phuong thuc remove doi tuong
    public boolean remove(E element){
        if (head.data.equals(element)){
            remove(0);
            return true;
        }
        else {
            Node temp = head;
            while (temp.next!=null){
                if (temp.next.data.equals(element)){
                    temp.next = temp.next.next;
                    numberNode--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }
    public boolean contains(E element){
        Node temp = head;
        while (temp.next!=null){
            if (temp.data.equals(element)){
                return true;
            }
            temp=temp.next;
        }
        if (temp.data.equals(element)){
            return true;
        }
        return false;
    }

    public int indexOf(E element){
        Node temp = head;
        for (int i=0;i<numberNode;i++){
            if (temp.data.equals(element)){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

}
