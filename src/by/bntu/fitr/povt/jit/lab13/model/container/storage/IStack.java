/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.container.storage;

import by.bntu.fitr.povt.jit.lab13.model.exception.StorageIsEmptyException;

/**
 *
 * @author Swyatoslaw Yakimovich
 */
public interface IStack<E> {

    public void push(E item);

    public E pop() throws StorageIsEmptyException;

    public int size();

    public boolean contains(E item);

    public boolean isEmpty();

}
