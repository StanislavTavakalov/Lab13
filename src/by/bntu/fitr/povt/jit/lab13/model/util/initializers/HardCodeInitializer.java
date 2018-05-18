/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.util.initializers;

import by.bntu.fitr.povt.jit.lab13.model.container.Disk;
import by.bntu.fitr.povt.jit.lab13.model.exception.InvalidPercentageValueException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NegativeFileSizeException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NegativeLengthException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NullPointerStringExceptions;
import by.bntu.fitr.povt.jit.lab13.model.file.soundfile.SoundFile;
import by.bntu.fitr.povt.jit.lab13.model.file.soundfile.UncompressedSoundFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dima_T
 */
public class HardCodeInitializer implements Initializer {
    
    private static HardCodeInitializer uniqueInstance;

    private HardCodeInitializer() {
    }
    
    public static HardCodeInitializer getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new HardCodeInitializer();
        }
        return uniqueInstance;
    }

    @Override
    public Disk initialize() throws NullPointerStringExceptions, NegativeFileSizeException, InvalidPercentageValueException, NegativeLengthException{
      
            Disk disk = new Disk();
            UncompressedSoundFile cFile = new UncompressedSoundFile(SoundFile.MusicGenre.ROCK, 70, "Bilan", "Forever", 200, 10);
            UncompressedSoundFile cFile1 = new UncompressedSoundFile(SoundFile.MusicGenre.ROCK, 70, "Yaer", "Alone", 150, 7);
            UncompressedSoundFile cFile2 = new UncompressedSoundFile(SoundFile.MusicGenre.ROCK, 70, "Din", "JustAName", 175, 3);
            UncompressedSoundFile cFile3 = new UncompressedSoundFile(SoundFile.MusicGenre.ROCK, 70, "Rin", "Sunrise", 110, 21);
            disk.add(cFile);
            disk.add(cFile1);
            disk.add(cFile2);
            disk.add(cFile3);
            return disk;    
    }
    
}
