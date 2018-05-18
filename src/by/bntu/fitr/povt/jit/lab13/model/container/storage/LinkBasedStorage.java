/*
 * To change this license firster, choose License firsters in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.container.storage;

import by.bntu.fitr.povt.jit.lab13.model.exception.QueueIsEmptyException;
import by.bntu.fitr.povt.jit.lab13.model.exception.StorageIsEmptyException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Swyatoslaw Yakimovich
 * @param <E>
 */
public abstract class LinkBasedStorage<E> extends AbstractStorage<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E data) {
        if (last == null) {
            last = new Node<>(data);
            first = last;
        } else {
            last.next = new Node<>(data);
            last.next.prev = last;
            last = last.next;
            // Node<E> temp = tail;
            // tail = new Node<>(data);
            // temp.setPrev(tail);
            // tail.setNext(temp);

            //short method, without new variable
//            last.setPrev(new Node<>(data));
//            last.getPrev().setNext(last);
//            last = last.getPrev();
//            last.prev = new Node<>(data);
//            last.prev.setNext(last);
//            last = last.prev;
        }
        size++;
    }

    public void addFirst(E data) {
        if (first == null) {
            first = new Node<>(data);
            first = last;

        } else {
            Node<E> temp = first;
            first = new Node<>(data);
            first.setNext(temp);
        }
        size++;
    }

    public void addLast(E data) {
        if (last == null) {
            last = new Node<>(data);
            first = last;

        } else {
            last.next = new Node<>(data);
            last.next.prev = last;
            last = last.next;
        }
        size++;
    }

    public E removeFirst() throws StorageIsEmptyException {
        if (first == null) {
            throw new QueueIsEmptyException();
        } else {

            Node<E> temp = first;
            first = first.next;
            if (first != null) {
                first.prev = null;
            }
            size--;
            return (E) temp.getData();
        }
    }

    public E removeLast() throws StorageIsEmptyException {
        if (last == null) {
            throw new QueueIsEmptyException();
        } else {
            Node<E> temp = last;
            last = last.prev;
            if (last != null) {
                last.next = null;
            }
            size--;
            return (E) temp.getData();
        }
    }

    @Override
    public int count() {
        int counter = 0;
        Node<E> p = first;
        while (p != null) {
            p = p.getNext();
            counter++;
        }
        return counter;
    }

    @Override
    public boolean contains(E item) {
        Node<E> p = this.first;
        while (p != null) {
            if (p.getData() == item) {
                return true;
            }
            p = p.getNext();
        }
        return false;
    }

    @Override
    public boolean containsEquals(E item) {
        Node<E> p = this.first;
        while (p != null) {
            if (p.getData().equals(item)) {
                return true;
            }
            p = p.getNext();
        }
        return false;
    }

    @Override
    public String toString() {
        String s = "LinkBasedStorage{";
        Node<E> p = this.first;
        while (p != null) {
            s += p.getData() + " ";
            p = p.getNext();
        }
        return s + "}";
    }

    public Object[] toArray() {
        Object[] items = new Object[size];
        Node<E> p = first;
        int i = 0;
        while (p != null) {
            items[i] = p.getData();
            p = p.getNext();
            i++;
        }
        return items;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkBasedStorageIterator<>(this);
    }

    private class Node<E> {

        private E data;
        private Node next;
        private Node prev;

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

    }

    private class LinkBasedStorageIterator<E> implements Iterator<E> {

        private final Object[] items;
        private int index;

        public LinkBasedStorageIterator(LinkBasedStorage<E> storage) {
            items = storage.toArray();
        }

        @Override
        public boolean hasNext() {
            if (index == size) {
                index = 0;
                return false;
            }
            return index < size;
        }

        @Override
        public E next() {
            if (index == size) {
                throw new NoSuchElementException();
            }
            index++;
            return (E) items[index - 1];
        }
    }
}
