/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.view.printers;

import by.bntu.fitr.povt.jit.lab13.model.container.Disk;

/**
 *
 * @author Dima_T
 */
public class ConsolePrinter implements Printer{
    
    private static ConsolePrinter uniqueInstance;

    private ConsolePrinter() {
    }
    
    public static ConsolePrinter getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ConsolePrinter();
        }
        return uniqueInstance;
    }

    @Override
    public void print(Disk disk) {
       System.out.println(disk);
    }
    
    
}
