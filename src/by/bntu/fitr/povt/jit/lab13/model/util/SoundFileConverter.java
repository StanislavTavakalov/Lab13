/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.util;

import by.bntu.fitr.povt.jit.lab13.model.exception.DamagedFileException;
import by.bntu.fitr.povt.jit.lab13.model.exception.InvalidPercentageValueException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NegativeFileSizeException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NullPointerStringExceptions;
import by.bntu.fitr.povt.jit.lab13.model.file.soundfile.CompressedSoundFile;
import by.bntu.fitr.povt.jit.lab13.model.exception.NegativeLengthException;
import by.bntu.fitr.povt.jit.lab13.model.file.soundfile.UncompressedSoundFile;
import java.util.Random;

/**
 *
 * @author Swyatoslaw Yakimovich
 */
public class SoundFileConverter {

    private static final int MAXCOMPRESSION = 50;

    private static SoundFileConverter uniqueInstance;

    private SoundFileConverter() {
    }

    public static SoundFileConverter getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SoundFileConverter();
        }
        return uniqueInstance;
    }

    public CompressedSoundFile compress(UncompressedSoundFile sound)
            throws NullPointerStringExceptions, NegativeFileSizeException,
            InvalidPercentageValueException, InvalidPercentageValueException,
            NegativeLengthException, DamagedFileException {

        if (sound.getDamage() == 0) {
            int compression = new Random().nextInt(MAXCOMPRESSION);
            return new CompressedSoundFile(
                    compression, sound.getGenre(), sound.getLength(),
                    sound.getSinger(), sound.getFileName(),
                    sound.getSize() * (100 - compression) / 100, sound.getDamage());
        } else {
            throw new DamagedFileException();
        }
    }

    public static UncompressedSoundFile decompress(CompressedSoundFile sound)
            throws NullPointerStringExceptions, NegativeFileSizeException,
            InvalidPercentageValueException, InvalidPercentageValueException,
            NegativeLengthException, DamagedFileException {

        if (sound.getDamage() == 0) {
            return new UncompressedSoundFile(
                    sound.getGenre(), sound.getLength(), sound.getSinger(),
                    sound.getFileName(),
                    sound.getSize() / ((100 - sound.getCompression()) / 100.),
                    sound.getDamage());
        } else {
            throw new DamagedFileException();
        }
    }
}
