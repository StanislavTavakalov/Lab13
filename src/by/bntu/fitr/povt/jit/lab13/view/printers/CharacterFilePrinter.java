/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.view.printers;

import by.bntu.fitr.povt.jit.lab13.filework.CharacterDiskWorker;
import by.bntu.fitr.povt.jit.lab13.model.container.Disk;

/**
 *
 * @author Dima_T
 */
public class CharacterFilePrinter implements Printer{
    
     private static CharacterFilePrinter uniqueInstance;

    private CharacterFilePrinter() {
    }
    
    public static CharacterFilePrinter getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new CharacterFilePrinter();
        }
        return uniqueInstance;
    }

    @Override
    public void print(Disk disk) {
           String filename = "D:\\fileChar.txt";
           CharacterDiskWorker.write(disk, filename);
    }
    
}
