/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.container;

import by.bntu.fitr.povt.jit.lab13.model.exception.DiskIsOverflowException;
import by.bntu.fitr.povt.jit.lab13.model.container.storage.LinkedStack;
import java.util.Iterator;
import by.bntu.fitr.povt.jit.lab13.model.exception.StorageIsEmptyException;
import by.bntu.fitr.povt.jit.lab13.model.file.File;
import java.util.ArrayList;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Swyatoslaw Yakimovich
 * @param <E> the type of elements in this storage
 */
public class Disk<E extends File> implements Iterable<E> {

    private List<E> storage;
    //private double maxSize;

    public Disk() {
        storage = new ArrayList<>();
        //  maxSize = Double.POSITIVE_INFINITY;
    }

    public Disk(List<E> storage) {
        this.storage = storage;
        // maxSize = Double.POSITIVE_INFINITY;
    }

    public List<E> getStorage() {
        return storage;
    }

    public void setStorage(List<E> storage) {
        this.storage = storage;
    }

//    public Disk(List<E> storage, double maxSize) {
//        this.storage = storage;
//        if (maxSize > 0) {
//            this.maxSize = maxSize;
//        }
//    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Disk: ").append("\n");
        for (File file : storage){
            builder.append(file).append("\n");
        }
        return builder.toString();
    }

    public void add(E item) {
        storage.add(item);
    }

    public E del(int i) {
        return storage.remove(i);
    }

    public int count() {
        return storage.size();
    }

    public boolean contains(E item) {
        return storage.contains(item);
    }

    public boolean containsEquals(E item) {
        return storage.contains(item);
    }

    @Override
    public Iterator<E> iterator() {
        return storage.iterator();
    }

    public Disk copy() {

        return new Disk(storage);
    }

//    public void find(parametrsType type, String value) {
//        if(type == parametrsType.SIZE){
//            for
//        }
//                    }
                    
        enum parametrsType {
            SIZE, NAME, DAMAGE;
        }
    }
