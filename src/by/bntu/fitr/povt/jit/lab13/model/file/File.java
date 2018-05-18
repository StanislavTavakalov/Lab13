/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.file;

import by.bntu.fitr.povt.jit.lab13.model.exception.NullPointerStringExceptions;
import by.bntu.fitr.povt.jit.lab13.model.exception.NegativeFileSizeException;
import by.bntu.fitr.povt.jit.lab13.model.exception.InvalidPercentageValueException;
import by.bntu.fitr.povt.jit.lab13.model.exception.InvalidValueException;

/**
 *
 * @author Swyatoslaw Yakimovich
 */
public abstract class File implements Damageable, Comparable<File> {

    private String fileName;
    private double size;
    private int damage;

    public File() {
        fileName = "NewFile";
    }

    public File(String fileName, double size) throws
            NullPointerStringExceptions, NegativeFileSizeException {

        if (fileName != null) {
            this.fileName = fileName;
        } else {
            throw new NullPointerStringExceptions();
        }

        if (size >= 0) {
            this.size = size;
        } else {
            throw new NegativeFileSizeException();
        }
    }

    public File(String fileName, double size, int damage) throws
            NullPointerStringExceptions, NegativeFileSizeException,
            InvalidPercentageValueException {

        this(fileName, size);
        
        if (damage >= 0 && damage <= 100) {
            this.damage = damage;
        } else {
            throw new InvalidPercentageValueException();
        }
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) throws NullPointerStringExceptions {
        if (fileName != null) {
            this.fileName = fileName;
        } else {
            throw new NullPointerStringExceptions();
        }
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) throws NegativeFileSizeException {
        if (size >= 0) {
            this.size = size;
        } else {
            throw new NegativeFileSizeException();
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) throws InvalidPercentageValueException {
        if (damage >= 0 && damage <= 100) {
            this.damage = damage;
        } else {
            throw new InvalidPercentageValueException();
        }
    }

    @Override
    public int compareTo(File o) {
        return fileName.compareTo(o.fileName);
    }
    
    public abstract File copy();
}
