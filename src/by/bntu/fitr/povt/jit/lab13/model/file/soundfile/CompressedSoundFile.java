/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.file.soundfile;

import by.bntu.fitr.povt.jit.lab13.model.exception.NegativeLengthException;
import by.bntu.fitr.povt.jit.lab13.model.exception.InvalidCompressionValueException;
import by.bntu.fitr.povt.jit.lab13.model.exception.InvalidPercentageValueException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NegativeFileSizeException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NullPointerStringExceptions;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;

/**
 *
 * @author Swyatoslaw Yakimovich
 */
public class CompressedSoundFile extends SoundFile {

    private int compression;

    public CompressedSoundFile() throws NullPointerStringExceptions,
            NegativeFileSizeException, InvalidPercentageValueException {
        super();
    }

    public CompressedSoundFile(int compression, MusicGenre genre, int length,
            String singer, String fileName, double size, int damage)
            throws NullPointerStringExceptions, NegativeFileSizeException,
            InvalidPercentageValueException, NegativeLengthException {

        super(genre, length, singer, fileName, size, damage);
        if (compression >= 0 && compression <= 100) {
            this.compression = compression;
        } else {
            throw new InvalidPercentageValueException();
        }
    }

    public int getCompression() {
        return compression;
    }

    public void setCompression(int compression) throws InvalidCompressionValueException {
        if (compression >= 0 && compression < 100) {
            this.compression = compression;
        } else {
            throw new InvalidCompressionValueException();
        }
    }

    @Override
    public void damage(int percentage) throws InvalidPercentageValueException {
        if (percentage >= 0 && percentage <= 100) {
            try {
                setLength((int) (getLength() * (100 - percentage) * (1 - percentage / 100. * compression / 100.) / 100.));
            } catch (NegativeLengthException ex) {
                throw new InternalError();
            }
            setDamage(percentage);
        } else {
            throw new InvalidPercentageValueException();
        }
    }

    @Override
    public String toString() {
        return "CompressedSoundFile{" + "fileName=" + getFileName()
                + ", size=" + getSize() + ", damage=" + getDamage()
                + ", genre=" + getGenre() + ", length=" + getLength()
                + ", singer=" + getSinger() + ", compression=" + compression + '}';
    }

    @Override
    public CompressedSoundFile copy() {
        try {
            return new CompressedSoundFile(compression, getGenre(), getLength(), getSinger(), getFileName(), getSize(), getDamage());
        } catch (NullPointerStringExceptions | NegativeFileSizeException | NegativeLengthException | InvalidPercentageValueException ex) {
            throw new InternalError();
        }
    }

    
}
