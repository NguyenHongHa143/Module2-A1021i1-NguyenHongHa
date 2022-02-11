package b11_DSA_Stack_and_Queue.thuc_hanh.trien_khai_Stack_su_dung_lop_linkedList;

public class GenericStackClient {
    public static void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");
        stack.push("Five");
        System.out.println("The size of stack: "+ stack.size());
        while (!stack.isEmpty()){
            System.out.println("the stack delete "+stack.pop());
            System.out.println("The size of stack: "+ stack.size());
        }

    }
    public static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("The size of stack: "+ stack.size());
        while (!stack.isEmpty()){
            System.out.println("the stack delete "+stack.pop());
            System.out.println("The size of stack: "+ stack.size());
        }

    }

    public static void main(String[] args) {
        stackOfIntegers();
        stackOfIStrings();
    }

}
