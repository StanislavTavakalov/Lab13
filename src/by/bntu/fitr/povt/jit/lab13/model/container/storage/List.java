/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.container.storage;

import by.bntu.fitr.povt.jit.lab13.model.exception.ListIsEmptyException;
import by.bntu.fitr.povt.jit.lab13.model.file.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 *
 * @param <E> the type of elements in this stack
 * @author Swyatoslaw Yakimovich
 */
public class List<E extends File> extends LinkBasedStorage<E>{

    private ListItem<E> head;
    private int size;

    public List() {
    }

    @Override
    public void add(E data) {
        addLast(data);
    }

    @Override
    public E remove() throws ListIsEmptyException {
        return (E) delFirst();
    }

    public void addFirst(E data) {
        if (head == null) {
            head = new ListItem<>(data);
        } else {
            ListItem<E> temp = head;
            head = new ListItem<>(data);
            head.setNext(temp);
        }
        size++;
    }

    public void addLast(E data) {
        if (head == null) {
            head = new ListItem<>(data);
        } else {
            ListItem<E> p = head;
            while (p.getNext() != null) {
                p = p.getNext();
            }
            p.setNext(new ListItem<>(data));
        }
        size++;
    }

//    public E pop() throws StackIsEmptyExeptions {
//        if (top == null) {
//            throw new StackIsEmptyExeptions();
//        } else {
//            E data = top.getData();
//            top = top.getNext();
//            return data;
//        }
//    }
    public E delFirst() throws ListIsEmptyException {
        if (head == null) {
            throw new ListIsEmptyException();
        } else {
            ListItem<E> temp = head;
            head = head.getNext();
            size--;
            return temp.getData();
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int count() {
        int counter = 0;
        ListItem<E> p = head;
        while (p != null) {
            p = p.getNext();
            counter++;
        }
        return counter;
    }

    @Override
    public boolean contains(E item) {
        ListItem<E> p = this.head;
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
        ListItem<E> p = this.head;
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
        String s = "List{";
        ListItem<E> p = this.head;
        while (p != null) {
            s += p.getData() + " ";
            p = p.getNext();
        }
        return s + "}";
    }

    //recursive
//    @Override
//    public String toString() {
//        return "List{" + "top=" + top + '}';
//    }
    //@Override
    public int search(E data) {
        if (head == null) {
            return -1;
        } else {
            int index = 0;
            ListItem<E> p = this.head;
            while (p != null) {
                if (data.equals(p.getData())) {
                    return index;
                }
                p = p.getNext();
                index++;
            }
            return -1;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator<>(this, head);
    }

    @Override
    public List copy() {
        List<E> list = new List<>();
        ListItem<E> p = this.head;
        while (p != null) {
            list.addLast((E) p.getData().copy());
        }
        return list;
    }

}

class ListItem<E> {

    private E data;
    private ListItem<E> next;

    public ListItem() {
    }

    public ListItem(E data) {
        this.data = data;
    }

    public E getData() {
        return (E) data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public ListItem<E> getNext() {
        return next;
    }

    public void setNext(ListItem<E> next) {
        this.next = next;
    }

    //recursive
//    @Override
//    public String toString() {
//        return "StackItem{" + "data=" + data + ", next=" + next + '}';
//    }
}

class ListIterator<E extends File> implements Iterator<E> {

    private int index;
    private int size;
//    private E[] items;
    private ArrayList<E> items;

    public ListIterator(List<E> list, ListItem<E> head) {
        size = list.count();
        items = new ArrayList<>(size);
//        items = (E[]) new Object[size];
        int i = 0;
        ListItem<E> p = head;
        while (p != null) {
//            items[i] = p.getData();
            items.add(p.getData());
            p = p.getNext();
            i++;
        }
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
        return (E) items.get(index - 1);
    }

}
