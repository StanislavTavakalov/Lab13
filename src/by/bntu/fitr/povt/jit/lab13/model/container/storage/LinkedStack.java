/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.container.storage;

import by.bntu.fitr.povt.jit.lab13.model.exception.StorageIsEmptyException;
import by.bntu.fitr.povt.jit.lab13.model.file.File;
import java.util.Iterator;

/**
 *
 * @author Swyatoslaw Yakimovich
 */
public class LinkedStack<E extends File> extends LinkBasedStorage<E> implements IStack<E> {

    public LinkedStack() {
    }

    @Override
    public E remove() throws StorageIsEmptyException {
        return removeLast();
    }

    @Override
    public void push(E item) {
        addLast(item);
    }

    @Override
    public E pop() throws StorageIsEmptyException {
        return removeLast();
    }

    @Override
    public Storage<E> copy() {
        LinkedStack<E> temp = new LinkedStack<>();
        for (E e : this) {
            if (e != null) {
                temp.push((E) e.copy());
            }
        }
        return temp;
    }

}
