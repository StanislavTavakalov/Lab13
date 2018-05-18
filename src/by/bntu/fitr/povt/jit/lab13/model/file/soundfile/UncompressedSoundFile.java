/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.file.soundfile;

import by.bntu.fitr.povt.jit.lab13.model.exception.NegativeLengthException;
import by.bntu.fitr.povt.jit.lab13.model.exception.InvalidPercentageValueException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NegativeFileSizeException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NullPointerStringExceptions;

/**
 *
 * @author Swyatoslaw Yakimovich
 */
public class UncompressedSoundFile extends SoundFile {

    public UncompressedSoundFile() {
        super();
    }

    public UncompressedSoundFile(MusicGenre genre, int length, String singer,
            String fileName, double size, int damage)
            throws NullPointerStringExceptions, NegativeFileSizeException,
            InvalidPercentageValueException, NegativeLengthException {
        super(genre, length, singer, fileName, size, damage);
    }

    @Override
    public void damage(int percentage) throws InvalidPercentageValueException, NegativeLengthException {
        if (percentage >= 0 && percentage <= 100) {
            setLength(getLength() * (100 - percentage) / 100);
            setDamage(percentage);
        } else {
            throw new InvalidPercentageValueException();
        }
    }

    @Override
    public String toString() {
        return "UncompressedSoundFile{" + "fileName=" + getFileName()
                + ", size=" + getSize() + ", damage=" + getDamage()
                + ", genre=" + getGenre() + ", length=" + getLength()
                + ", singer=" + getSinger() + '}';
    }

    @Override
    public UncompressedSoundFile copy() {
        try {
            return new UncompressedSoundFile(getGenre(), getLength(), getSinger(), getFileName(), getSize(), getDamage());
        } catch (NullPointerStringExceptions | NegativeFileSizeException | NegativeLengthException | InvalidPercentageValueException ex) {
            throw new InternalError();
        }
    }
    
    
}
