/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.container.storage;

import by.bntu.fitr.povt.jit.lab13.model.exception.StorageIsEmptyException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NegativeLengthException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Swyatoslaw Yakimovich
 */
public abstract class ArrayBasedStorage<E> extends AbstractStorage<E> {

    private Object[] array;
    private static final Object[] EMPTY_ELEMENTDATA = {};
    private int size;

    public ArrayBasedStorage() {
        array = new Object[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    public ArrayBasedStorage(int initialCapacity) throws NegativeLengthException {
        if (initialCapacity > 0) {
            array = new Object[initialCapacity];
            for (int i = 0; i < array.length; i++) {
                array[i] = null;
            }
        } else if (initialCapacity == 0) {
            array = EMPTY_ELEMENTDATA;
        } else {
            throw new NegativeLengthException("Illegal Capacity: "
                    + initialCapacity);
        }
    }

//    private ArrayBasedStorage(E[] arr) {
//        array = arr;
//        size = arr.length;
//    }
//    public E getElement(int index) {
//        if (index >= 0 && index < array.length) {
//            return (E)array[index];
//        }else{
//            throw 
//        }
//    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public int count() {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (null != array[i]) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public boolean contains(E obj) {
        for (Object array1 : array) {
            if (obj == array1) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsEquals(E obj) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    private int lastFreePlaceFromEnd() {
        int index = -1;
        if (array.length != 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] == null) {
                    index = i;
                } else {
                    break;
                }
            }
        }
        return index;
    }

    private int lastFreePlaceFromBeg() {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                index = i;
            } else {
                break;
            }
        }
        return index;
    }

    public void addLast(E obj) {
        if (size == array.length) {
            Object[] newArray = Arrays.copyOf(array, array.length + 1);
            newArray[newArray.length - 1] = obj;
            array = newArray;
        } else {
            array[lastFreePlaceFromEnd()] = obj;
        }
        size++;
    }

    public void addFirst(E obj) {
        if (size == array.length) {
            Object[] newArray = Arrays.copyOf(array, array.length + 1);
            newArray[newArray.length - 1] = obj;
            array = newArray;
        } else {
            array[lastFreePlaceFromBeg()] = obj;
        }
        size++;
    }

    public E delLast() throws StorageIsEmptyException {
        E temp = null;
        if (size != 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] != null) {
                    temp = (E) array[i];
                    array[i] = null;
                    size--;
                    break;
                }
            }
        } else {
            throw new StorageIsEmptyException();
        }
        return temp;
    }

    public E delFirst() throws StorageIsEmptyException {
        E temp = null;
        if (size != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null) {
                    temp = (E) array[i];
                    size--;
                    break;
                }
            }
        } else {
            throw new StorageIsEmptyException();
        }
        return temp;
    }

    //@Override
    public int search(E data) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public E[] toArray() {
        E[] arr = (E[]) new Object[size];
        int iarr = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                arr[iarr] = (E) array[i];
                iarr++;
            }
        }
        return arr;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayBasedStorageIterator<>();
    }

    private class ArrayBasedStorageIterator<E> implements Iterator<E> {

        private int index;
        Object[] arr;

        public ArrayBasedStorageIterator() {
            arr = new Object[size];
            int iarr = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null) {
                    arr[iarr] = array[i];
                    iarr++;
                }
            }
        }

        @Override
        public boolean hasNext() {
            if (index == arr.length) {
                index = 0;
                return false;
            }
            return index < arr.length;
        }

        @Override
        public E next() {
            if (index == arr.length) {
                throw new NoSuchElementException();
            }
            index++;
            return (E) arr[index - 1];
        }

    }

}
