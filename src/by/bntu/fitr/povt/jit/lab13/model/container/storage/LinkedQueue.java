/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.container.storage;

import by.bntu.fitr.povt.jit.lab13.model.exception.StorageIsEmptyException;
import by.bntu.fitr.povt.jit.lab13.model.file.File;

/**
 *
 * @author Swyatoslaw Yakimovich
 */
public class LinkedQueue<E extends File> extends LinkBasedStorage<E> {

    @Override
    public E remove() throws StorageIsEmptyException {
        return removeFirst();
    }

    @Override
    public Storage<E> copy() {
        LinkedQueue<E> temp = new LinkedQueue<>();
//        System.out.println("----------------");
//        System.out.println("size="+size());
//        for (E e : this) {
//            System.out.println(e);
//
//        }
//        System.out.println("----------------");

        for (E e : this) {
            if (e != null) {
                temp.add((E) e.copy());
            }
        }
        return temp;
    }

}
