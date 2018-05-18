/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.controller;

import by.bntu.fitr.povt.jit.lab13.model.util.initializers.RandomInitializer;
import by.bntu.fitr.povt.jit.lab13.model.util.initializers.Initializer;
import by.bntu.fitr.povt.jit.lab13.comparator.FileSortType;
import by.bntu.fitr.povt.jit.lab13.comparator.SortByDamageASC;
import by.bntu.fitr.povt.jit.lab13.filework.BinaryDiskWorker;
import by.bntu.fitr.povt.jit.lab13.filework.CharacterDiskWorker;
import by.bntu.fitr.povt.jit.lab13.model.container.Disk;
import by.bntu.fitr.povt.jit.lab13.model.exception.DiskIsOverflowException;
import by.bntu.fitr.povt.jit.lab13.model.container.storage.LinkedQueue;
import by.bntu.fitr.povt.jit.lab13.model.container.storage.LinkedStack;
import by.bntu.fitr.povt.jit.lab13.model.exception.InvalidPercentageValueException;
import by.bntu.fitr.povt.jit.lab13.view.View;
import by.bntu.fitr.povt.jit.lab13.model.exception.StorageIsEmptyException;
import by.bntu.fitr.povt.jit.lab13.model.exception.InvalidValueException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NegativeFileSizeException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NullPointerStringExceptions;
import by.bntu.fitr.povt.jit.lab13.model.exception.NegativeLengthException;
import by.bntu.fitr.povt.jit.lab13.model.file.File;
import by.bntu.fitr.povt.jit.lab13.model.file.soundfile.SoundFile;
import by.bntu.fitr.povt.jit.lab13.model.file.soundfile.UncompressedSoundFile;
import by.bntu.fitr.povt.jit.lab13.model.util.Damager;
import by.bntu.fitr.povt.jit.lab13.model.util.FileSorter;
import by.bntu.fitr.povt.jit.lab13.model.util.search.FileSearchFilter;
import by.bntu.fitr.povt.jit.lab13.model.util.search.FileSearcher;
import by.bntu.fitr.povt.jit.lab13.model.util.search.SearchByDamageInterval;
import by.bntu.fitr.povt.jit.lab13.model.util.search.SearchByFileNameContains;
import by.bntu.fitr.povt.jit.lab13.model.util.search.SearchByFileNameStartWith;
import by.bntu.fitr.povt.jit.lab13.view.printers.BinaryFilePrinter;
import by.bntu.fitr.povt.jit.lab13.view.printers.CharacterFilePrinter;
import by.bntu.fitr.povt.jit.lab13.view.printers.ConsolePrinter;
import by.bntu.fitr.povt.jit.lab13.view.printers.Printer;
import java.util.List;


public class Controller {

   

    public static void testSearch1() {
        try {
            Disk disk = new Disk();
            disk.add(new UncompressedSoundFile(SoundFile.MusicGenre.ROCK, 1, "", "Filename1", 1.1, 10));
            disk.add(new UncompressedSoundFile(SoundFile.MusicGenre.ROCK, 1, "", "Filename2", 2.1, 20));
            disk.add(new UncompressedSoundFile(SoundFile.MusicGenre.ROCK, 1, "", "NewFilename3", 3.1, 30));
            disk.add(new UncompressedSoundFile(SoundFile.MusicGenre.ROCK, 1, "", "NewFilename4", 5.1, 50));
            disk.add(new UncompressedSoundFile(SoundFile.MusicGenre.ROCK, 1, "", "NewFilename5", 9.1, 60));
            disk.add(new UncompressedSoundFile(SoundFile.MusicGenre.ROCK, 1, "", "NewFilename6", 7.1, 70));
            disk.add(new UncompressedSoundFile(SoundFile.MusicGenre.ROCK, 1, "", "Filename7", 9.1, 90));
            List<File> resultList;
            View.println("########## Searching ###########");
            View.println("########## test1 ###########");
            FileSearcher.replaceSearchFilter(FileSearchFilter.DAMAGE_INTERVAL, new SearchByDamageInterval(20, 40));
            resultList = FileSearcher.search(disk, FileSearchFilter.DAMAGE_INTERVAL);
            View.println(resultList.toString());
            View.println("########## test1 ###########");

            View.println("########## test2 ###########");
            resultList = FileSearcher.searchByFilter(disk, new SearchByDamageInterval(50, 70));
            View.println(resultList.toString());
            View.println("########## test2 ###########");

            View.println("########## test3 ###########");
            resultList = FileSearcher.searchByDamageInterval(disk, 50, 70);
            View.println(resultList.toString());
            View.println("########## test3 ###########");

            View.println("########## test4 ###########");
            resultList = FileSearcher.searchByFilter(disk, a -> a.getDamage() >= 50 && a.getDamage() <= 80);
            View.println(resultList.toString());
            View.println("########## test4 ###########");

            View.println("########## test5 ###########");
            resultList = FileSearcher.searchByFilter(disk, new SearchByFileNameStartWith("File"));
            View.println(resultList.toString());
            View.println("########## test5 ###########");

            View.println("########## test6 ###########");
            FileSearcher.replaceSearchFilter(FileSearchFilter.FILE_NAME_CONTAINS, new SearchByFileNameContains("4"));
            resultList = FileSearcher.search(disk, FileSearchFilter.FILE_NAME_CONTAINS);
            //resultList = FileSearcher.searchByFilter(disk, new SearchByFileNameStartWith("File"));
            View.println(resultList.toString());
            View.println("########## test6 ###########\n\n");

        } catch (Exception ex) {
            View.println(ex.getMessage());
        }

    }
    
    public static void testReadWriteDiskBinary() {
         try {
        String filename = "D:\\file.bin";
        Disk disk = new Disk();
        UncompressedSoundFile cFile = new UncompressedSoundFile(SoundFile.MusicGenre.ROCK, 70, "Bilan", "Forever", 200, 10);
        UncompressedSoundFile cFile1 = new UncompressedSoundFile(SoundFile.MusicGenre.ROCK, 70, "Yaer", "Alone", 150, 7);
        UncompressedSoundFile cFile2 = new UncompressedSoundFile(SoundFile.MusicGenre.ROCK, 70, "Din", "JustAName", 175, 3);
        UncompressedSoundFile cFile3 = new UncompressedSoundFile(SoundFile.MusicGenre.ROCK, 70, "Rin", "Sunrise", 110, 21);
        disk.add(cFile);
        disk.add(cFile1);
        disk.add(cFile2);
        disk.add(cFile3);
        
        BinaryDiskWorker.write(disk, filename);
        View.println(BinaryDiskWorker.read(filename).toString());
        
         }
         catch (Exception ex){
             View.println(ex.getMessage());
         }
        
    }
    
    
     public static void testReadWriteDiskChar() {
         try {
        String filename = "D:\\fileChar.txt";
        Disk disk = new Disk();
        UncompressedSoundFile cFile = new UncompressedSoundFile(SoundFile.MusicGenre.ROCK, 70, "Bilan", "Forever", 200, 10);
        UncompressedSoundFile cFile1 = new UncompressedSoundFile(SoundFile.MusicGenre.ROCK, 70, "Yaer", "Alone", 150, 7);
        UncompressedSoundFile cFile2 = new UncompressedSoundFile(SoundFile.MusicGenre.ROCK, 70, "Din", "JustAName", 175, 3);
        UncompressedSoundFile cFile3 = new UncompressedSoundFile(SoundFile.MusicGenre.ROCK, 70, "Rin", "Sunrise", 110, 21);
        disk.add(cFile);
        disk.add(cFile1);
        disk.add(cFile2);
        disk.add(cFile3);
        
        CharacterDiskWorker.write(disk, filename);
        View.println(CharacterDiskWorker.read(filename).toString());
        
         }
         catch (Exception ex){
             View.println(ex.getMessage());
         }
        
    }
     public static void testSort() {
        try {
            
          //  Disk disk = HardCodeInitializer.getInstance().initialize();
          Initializer initializer = RandomInitializer.getInstance();
          Disk disk = initializer.initialize();  
          //  Disk disk = BinaryFileInitializer.getInstance().initialize();  
          //  Disk disk = CharacterFileInitializer.getInstance().initialize();  
        //  View.println(disk.toString());

        //FileSorter.addFileComparator(FileSortType.SIZE_ASC, new SortByDamageASC());
      
        View.println(disk.toString());
        Printer printer = ConsolePrinter.getInstance();
        // Printer printer = CharacterFilePrinter.getInstance();
        // Printer printer = BinaryFilePrinter.getInstance();
        printer.print(disk);
        
        View.println("########## Sortings ###########");
        
        View.println("########## Default sorting ###########");
        FileSorter.sort(disk, null);
        View.println(disk.toString());
        
        View.println("########## FILENAME_DESC ###########");
        FileSorter.sort(disk, FileSortType.FILENAME_DESC);
        View.println(disk.toString());
        
        View.println("########## SIZE_ASC ###########");
        FileSorter.sort(disk,FileSortType.SIZE_ASC);
        View.println(disk.toString());
        
        View.println("########## SIZE_DESC ###########");
        FileSorter.sort(disk,FileSortType.SIZE_DESC);
        View.println(disk.toString());
        
        View.println("########## DAMAGE_ASC ###########");
        FileSorter.sort(disk, FileSortType.DAMAGE_ASC);
        View.println(disk.toString());
        
        View.println("########## DAMAGE_DESC ###########");
        FileSorter.sort(disk, FileSortType.DAMAGE_DESC);
        View.println(disk.toString());
        
   

        } catch (Exception ex) {
            View.println(ex.getMessage());
        }

    }

    public static void main(String[] args) throws InvalidValueException, StorageIsEmptyException, NullPointerStringExceptions, DiskIsOverflowException {
       // testSearch1();

        testSort();
      // testReadWriteDiskChar();
       // testReadWriteDiskBinary();
        
    }

}
