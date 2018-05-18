/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.view.printers;

import by.bntu.fitr.povt.jit.lab13.filework.BinaryDiskWorker;
import by.bntu.fitr.povt.jit.lab13.model.container.Disk;

/**
 *
 * @author Dima_T
 */
public class BinaryFilePrinter implements Printer{
    
     private static BinaryFilePrinter uniqueInstance;

    private BinaryFilePrinter() {
    }
    
    public static BinaryFilePrinter getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new BinaryFilePrinter();
        }
        return uniqueInstance;
    }

    @Override
    public void print(Disk disk) {
        String fileName = "D:\\file.bin";
        BinaryDiskWorker.write(disk, fileName);
    }
    
}
