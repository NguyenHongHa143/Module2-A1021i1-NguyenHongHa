package b10_DSA_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacyti) {
       if (capacyti>=0){
           elements = new Object[capacyti];
       }
       else {
           throw new IllegalArgumentException("lỗi");
       }
    }
    public int size(){
        return this.size;
    }
    public void clear(){
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i]=null;
        }
    }
    public boolean add(E element){
        if (this.size==elements.length){
            ensurCapacity(1);
        }
        elements[size] = element;
        size++;
        return true;
    }
    public void ensurCapacity(int mincapacity){
        if (mincapacity>0){
            int newSize = this.elements.length + mincapacity;
            elements = Arrays.copyOf(elements,newSize);
        }else {
            throw new IllegalArgumentException("mincapacity "+ mincapacity);
        }
    }

    public void add(int index,E element){
        if (index==size){
            add(element);
        }else if (index<0||index>size+1){
            throw new IllegalArgumentException("Index "+ index);
        }else {
            for (int i = size-1; i <=index ; i--) {
                elements[i] = elements[i-1];
            }
            elements[index] = element;
            size++;
        }

    }
    public E get(int index){
        return (E) elements[index];
    }
    public int indexOf(E element){
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(element)){
                return i;
            }
        }
        return -1;
    }
}
