/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.container.storage;

/**
 *
 * @author Swyatoslaw Yakimovich
 */
public abstract class AbstractStorage<E> implements Storage<E> {

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}
