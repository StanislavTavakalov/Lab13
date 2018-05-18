/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.container;

import by.bntu.fitr.povt.jit.lab13.model.exception.DiskIsOverflowException;
import by.bntu.fitr.povt.jit.lab13.model.container.storage.LinkedStack;
import by.bntu.fitr.povt.jit.lab13.model.container.storage.List;
import by.bntu.fitr.povt.jit.lab13.model.exception.StorageIsEmptyException;
import by.bntu.fitr.povt.jit.lab13.model.file.File;
import java.util.Iterator;
import by.bntu.fitr.povt.jit.lab13.model.container.storage.Storage;
import java.util.ArrayList;

/**
 *
 * @author Swyatoslaw Yakimovich
 * @param <E> the type of elements in this disk
 */
/*
    If change files in disk? files in backup dont changed. Its problem
    If change files in disk? files in backup dont changed. Its problem
    If change files in disk? files in backup dont changed. Its problem
    If change files in disk? files in backup dont changed. Its problem
    If change files in disk? files in backup dont changed. Its problem
    If change files in disk? files in backup dont changed. Its problem
    If change files in disk? files in backup dont changed. Its problem
    If change files in disk? files in backup dont changed. Its problem
 */
public abstract class RAID1<E extends File> implements Iterable<E> {
//
//    private Disk<E> disk;
//    private ArrayList<Disk<E>> backups;
//
//    public RAID1() {
//        disk = new Disk<>(new LinkedStack<>());
//        backups = new ArrayList<>(1);
//        backups.set(0, disk.copy());
//    }
//
//    public RAID1(Storage<E> storage) {
//        disk = new Disk(storage);
//        backups = new ArrayList<>(1);
//        backups.set(0, disk.copy());
//    }
//
//    public RAID1(Disk<E> disk) {
//        this.disk = disk;
//        backups = new ArrayList<>(1);
//        backups.add(0, disk.copy());
//    }
//
//    public RAID1(Disk<E> disk, ArrayList<Disk<E>> backups) {
//        this.disk = disk;
//        this.backups = backups;
//        for (int i = 0; i < backups.size(); i++) {
//            backups.add(i, disk.copy());
//        }
//    }
//
//    public void restore() {
//        for (int i = 0; i < backups.size(); i++) {
//            backups.set(i, disk.copy());
//        }
//
////        for (E e : disk) {
////            if (e.getDamage() != 0) {
////                e.setLength
////            }
////        }
//    }
//
//    @Override
//    public String toString() {
//        return "RAID1{" + "\n  disk=" + disk + ", \nbackup=" + backups + '}';
//    }
//
//    public void add(E item) throws DiskIsOverflowException {
//        disk.add(item);
//        for (int i = 0; i < backups.size(); i++) {
//            backups.get(i).add(item);
//        }
//    }
//
//    public E del() throws StorageIsEmptyException {
//        for (int i = 0; i < backups.size(); i++) {
//            backups.get(i).del();
//        }
//        return disk.del();
//    }
//
//    public int count() {
//        return disk.count();
//
//    }
//
//    public boolean contains(E item) {
//        return disk.contains(item);
//    }
//
//    public boolean containsEquals(E item) {
//        return disk.containsEquals(item);
//    }
//
////    public int search(E data) {
////        return disk.search(data);
////    }
//    @Override
//    public Iterator<E> iterator() {
//        return disk.iterator();
//    }
//
//    public RAID1 copy() {
//        return new RAID1(disk.copy());
//    }
}
