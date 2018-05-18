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
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dima_T
 */
public class RandomInitializer implements Initializer {
    
    private static RandomInitializer uniqueInstance;

    private RandomInitializer() {
    }
    
    public static RandomInitializer getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new RandomInitializer();
        }
        return uniqueInstance;
    }

    @Override
    public Disk initialize() throws NullPointerStringExceptions, NegativeFileSizeException, InvalidPercentageValueException, NegativeLengthException{
        Disk disk = new Disk();
        
        for (int i = 0; i<5; i++){
          disk.add(new UncompressedSoundFile());  
        }
        
        String[] FILENAMES = {"My dream", "Black Star", "Blue Moon",
            "Black Ice", "We Will Rock You", "Help!", "Let Me Live",
            "Smack That", "Now I Know", "Stay!", "No Love", "Sorry",
            "Polar Bear", "The One"};

        int[] SIZES = {100, 200, 300, 400, 500, 600};

      
        UncompressedSoundFile.MusicGenre[] musicGenres = UncompressedSoundFile.MusicGenre.values();

        int[] LENGTHS = {100, 200, 300, 400, 500, 600};

        String[] SINGERS = {"Carcass", "Queen", "Beatles", "Eminem",
            "Elton John", "Elvis Presley", "Elton", "Nicki Minaj"};

       
        Random random = new Random();
        
        for (Object sound : disk.getStorage()) {
            ((SoundFile)sound).setFileName(FILENAMES[random.nextInt(FILENAMES.length)]);
            ((SoundFile)sound).setSize(SIZES[random.nextInt(SIZES.length)]);
            // sound.set
            ((SoundFile)sound).setGenre(musicGenres[random.nextInt(musicGenres.length)]);
            ((SoundFile)sound).setLength(LENGTHS[random.nextInt(LENGTHS.length)]);
            ((SoundFile)sound).setSinger(SINGERS[random.nextInt(SINGERS.length)]);
            if(sound instanceof UncompressedSoundFile){
                ((UncompressedSoundFile) sound).setDamage(random.nextInt(100));   
            }
            // sound.set
        }
        
        return disk;
       
    }
    
    
}
