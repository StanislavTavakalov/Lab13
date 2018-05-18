/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.file.soundfile;

import by.bntu.fitr.povt.jit.lab13.model.exception.NegativeLengthException;
import by.bntu.fitr.povt.jit.lab13.model.file.File;
import by.bntu.fitr.povt.jit.lab13.model.exception.InvalidPercentageValueException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NegativeFileSizeException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NullPointerStringExceptions;

/**
 *
 * @author Swyatoslaw Yakimovich
 */
public abstract class SoundFile extends File {

    public enum MusicGenre {
        ROCK, JAZZ, BLUES, RAP, TRAP, CLASSIC
    };

    private MusicGenre genre;
    private int length;
    private String singer;

    public SoundFile() {
        super();
        this.genre = MusicGenre.CLASSIC;
        this.length = 0;
        this.singer = "Undefined";
    }

    public SoundFile(MusicGenre genre, int length, String singer,
            String fileName, double size, int damage)
            throws NullPointerStringExceptions, NegativeFileSizeException,
            InvalidPercentageValueException, NegativeLengthException {

        super(fileName, size, damage);
        this.genre = genre;

        if (length > 0) {
            this.length = length;
        } else {
            throw new NegativeLengthException();
        }

        if (singer != null) {
            this.singer = singer;
        } else {
            throw new NullPointerStringExceptions();
        }
    }

    public MusicGenre getGenre() {
        return genre;
    }

    public void setGenre(MusicGenre genre) {
        this.genre = genre;
    }

    public int getLength() {
        return length;
    }

    public String getLengthInTimeFormat() {
        return lengthInTimeFormat(length);
    }

    public void setLength(int length) throws NegativeLengthException {
        if (length >= 0) {
            this.length = length;
        } else {
            throw new NegativeLengthException();
        }
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) throws NullPointerStringExceptions {
        if (singer != null) {
            this.singer = singer;
        } else {
            throw new NullPointerStringExceptions();
        }
    }

    public static String lengthInTimeFormat(int length) {
        int minut = length / 60;
        if (minut > 0) {
            return minut + ":" + length % 60;
        }
        return "0:" + length % 60;
    }
    
    @Override
    public abstract SoundFile copy();
}
