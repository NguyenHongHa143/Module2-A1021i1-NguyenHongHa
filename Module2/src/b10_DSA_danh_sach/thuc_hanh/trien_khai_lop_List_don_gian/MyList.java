package b10_DSA_danh_sach.thuc_hanh.trien_khai_lop_List_don_gian;

import java.util.Arrays;

public class MyList<E> implements IMyList {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }


    @Override
    public void add(Object e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    @Override
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];

    }

    @Override
    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

}
