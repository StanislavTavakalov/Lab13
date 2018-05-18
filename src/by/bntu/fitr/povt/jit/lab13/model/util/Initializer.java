/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.util;

import by.bntu.fitr.povt.jit.lab13.model.exception.NegativeFileSizeException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NullPointerStringExceptions;
import by.bntu.fitr.povt.jit.lab13.model.exception.NegativeLengthException;
import by.bntu.fitr.povt.jit.lab13.model.file.soundfile.SoundFile;
import by.bntu.fitr.povt.jit.lab13.model.file.soundfile.UncompressedSoundFile;
import java.util.Random;

/**
 *
 * @author Swyatoslaw Yakimovich
 */
public class Initializer {

//    private static Initializer uniqueInstance;
//
//    private Initializer() {
//    }
//
//    public static Initializer getInstance() {
//        if (uniqueInstance == null) {
//            uniqueInstance = new Initializer();
//        }
//        return uniqueInstance;
//    }
//
//    public void initialize(SoundFile... sounds) throws NullPointerStringExceptions,
//            NegativeFileSizeException, NegativeLengthException {
//
//        String[] FILENAMES = {"My dream", "Black Star", "Blue Moon",
//            "Black Ice", "We Will Rock You", "Help!", "Let Me Live",
//            "Smack That", "Now I Know", "Stay!", "No Love", "Sorry",
//            "Polar Bear", "The One"};
//
//        int[] SIZES = {100, 200, 300, 400, 500, 600};
//
//        //int[] DAMAGE = {0, 0, 0, 0, 10, 20, 30, 40, 50, 60};
//        UncompressedSoundFile.MusicGenre[] musicGenres = UncompressedSoundFile.MusicGenre.values();
//
//        int[] LENGTHS = {100, 200, 300, 400, 500, 600};
//
//        String[] SINGERS = {"Carcass", "Queen", "Beatles", "Eminem",
//            "Elton John", "Elvis Presley", "Elton", "Nicki Minaj"};
//
//        //int[] COMPRESSION = {0, 0, 0, 0, 10, 20, 30, 40, 50, 60};
//        Random random = new Random();
//
//        for (SoundFile sound : sounds) {
//            sound.setFileName(FILENAMES[random.nextInt(FILENAMES.length)]);
//            sound.setSize(SIZES[random.nextInt(SIZES.length)]);
//            // sound.set
//            sound.setGenre(musicGenres[random.nextInt(musicGenres.length)]);
//            sound.setLength(LENGTHS[random.nextInt(LENGTHS.length)]);
//            sound.setSinger(SINGERS[random.nextInt(SINGERS.length)]);
//            // sound.set
//        }
//    }

//        public static void initialize(SoundFile sound) throws NullPointerStringExceptions,
//            NegativeFileSizeException, NegativeLengthException {
//
//        String[] FILENAMES = {"My dream", "Black Star", "Blue Moon",
//            "Black Ice", "We Will Rock You", "Help!", "Let Me Live",
//            "Smack That", "Now I Know", "Stay!", "No Love", "Sorry",
//            "Polar Bear", "The One"};
//
//        int[] SIZES = {100, 200, 300, 400, 500, 600};
//
//        //int[] DAMAGE = {0, 0, 0, 0, 10, 20, 30, 40, 50, 60};
//        UncompressedSoundFile.MusicGenre[] musicGenres = UncompressedSoundFile.MusicGenre.values();
//
//        int[] LENGTHS = {100, 200, 300, 400, 500, 600};
//
//        String[] SINGERS = {"Carcass", "Queen", "Beatles", "Eminem",
//            "Elton John", "Elvis Presley", "Elton", "Nicki Minaj"};
//
//        //int[] COMPRESSION = {0, 0, 0, 0, 10, 20, 30, 40, 50, 60};
//        Random random = new Random();
//
//        sound.setFileName(FILENAMES[random.nextInt(FILENAMES.length)]);
//        sound.setSize(SIZES[random.nextInt(SIZES.length)]);
//        // sound.set
//        sound.setGenre(musicGenres[random.nextInt(musicGenres.length)]);
//        sound.setLength(LENGTHS[random.nextInt(LENGTHS.length)]);
//        sound.setSinger(SINGERS[random.nextInt(SINGERS.length)]);
//        // sound.set
//    }
}
