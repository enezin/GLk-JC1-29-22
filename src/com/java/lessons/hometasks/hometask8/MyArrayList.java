package com.java.lessons.hometasks.hometask8;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<T> implements MyList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private Object[] elementData;
    private int size;

    MyArrayList() {
        capacity = DEFAULT_CAPACITY;
        elementData = new Object[capacity];
    }

    MyArrayList(int capacity) {
        this.capacity = capacity;
        elementData = new Object[capacity];
    }

    MyArrayList(MyList<? extends T> col) {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object value) {
        return indexOf(value) >= 0;
    }

    @Override
    public boolean add(Object value) {
        if (elementData.length == size) {
            growingArray();
        }
        for (int i = 0; i < elementData.length; i++) {
            if (elementData[i] == null) {
                elementData[i] = value;
                size++;
                break;
            }
        }
        return true;
    }

    @Override
    public boolean add(int index, Object value) {
        checkingIndex(index);
        if (elementData.length == size) {
            growingArray();
        }
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = value;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object value) {
        if (value == null) {
            return false;
        } else if (size == 0) {
            return false;
        } else {
            for (int i = 0; i < size; i++) {
                if (value.equals(elementData[i])) {
                    System.arraycopy(elementData, i + 1, elementData, i, size - i);
                    size--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> value) {
        return true;
    }

    @Override
    public T get(int index) {
        checkingIndex(index);
        return (T) elementData[index];
    }

    @Override
    public T remove(int index) {
        Object tempObject = null;
        checkingIndex(index);
        tempObject = elementData[index];
        System.arraycopy(elementData, index + 1, elementData, index, size - index);
        size--;
        return (T) tempObject;
    }

    @Override
    public Object set(int index, Object value) {
        checkingIndex(index);
        return elementData[index] = value;
    }

    @Override
    public int indexOf(Object value) {
        int result = -1;
        for (int i = 0; i < size; i++) {
            if (value.equals(elementData[i])) {
                result = i;
                break;
            }
        }
        return result;
    }

    private void growingArray() {
        elementData = Arrays.copyOf(elementData, elementData.length / 2 + elementData.length + 1);
    }

    private void checkingIndex(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }
}

