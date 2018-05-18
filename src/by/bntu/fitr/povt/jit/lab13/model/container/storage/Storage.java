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
 * @param <E> the type of elements in this stack
 */
public interface Storage<E> extends Iterable<E> {

    public void add(E item);

    public E remove() throws StorageIsEmptyException;
    
    public int count();
    
    public int size();
    
    public boolean contains(E item);
    
    public boolean containsEquals(E item);
    
    //public int search(E data);
    
    public Storage<E> copy();
    
    public boolean isEmpty();

}
