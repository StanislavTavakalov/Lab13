/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.container.storage;

import by.bntu.fitr.povt.jit.lab13.model.exception.StorageIsEmptyException;
import by.bntu.fitr.povt.jit.lab13.model.file.File;
import by.bntu.fitr.povt.jit.lab13.model.exception.NegativeLengthException;

/**
 *
 * @author Swyatoslaw Yakimovich
 */
public class ArrayQueue<E extends File> extends ArrayBasedStorage<E>{

    public ArrayQueue() {
    }

    public ArrayQueue(int initialCapacity) throws NegativeLengthException {
        super(initialCapacity);
    }
    @Override
    public void add(E item) {
        addLast(item);
    }

    @Override
    public E remove() throws StorageIsEmptyException {
        return delFirst();
    }

    @Override
    public Storage<E> copy() {
        ArrayStack<E> stack = null;
        try {
            stack = new ArrayStack<>(size());
            E[] arr = toArray();
            for (int i = 0; i < arr.length; i++) {
                stack.addLast((E) arr[i].copy());
            }
        } catch (Exception e) {
        }
        return stack;
    }
}
