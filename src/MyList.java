import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        ensureCapacity(1);
        for (int i = elements.length - 1; i > index; i--) {
                elements[i] = elements[i - 1];
        }
        size++;
        elements[index] = element;
    }

    public E remove(int index) {
        E temp = (E) elements[index];
        while (index < elements.length - 1) {
            elements[index] = elements[index + 1];
            index++;
        }

        elements[size] = null;
        size--;
        return temp;
    }

    public int size() {
        return size;
    }

    public MyList<E> clone() {
        MyList<E> clone = new MyList<E>(size);
        clone.size = size;
        if (size >= 0) System.arraycopy(elements, 0, clone.elements, 0, size);
        return clone;
    }

    public boolean contains(Object findElement) {
        for (Object o : elements) {
            if (findElement.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf (E o) {
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = elements.length + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0 ; i < elements.length; i++) {
            elements[i] = null;
        }
        size = 0;
    }
}
