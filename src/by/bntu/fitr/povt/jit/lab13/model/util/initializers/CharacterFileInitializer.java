/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.util.initializers;

import by.bntu.fitr.povt.jit.lab13.filework.CharacterDiskWorker;
import by.bntu.fitr.povt.jit.lab13.model.container.Disk;

/**
 *
 * @author Dima_T
 */
public class CharacterFileInitializer implements Initializer {
    
    private static CharacterFileInitializer uniqueInstance;

    private CharacterFileInitializer() {
    }
    
    public static CharacterFileInitializer getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new CharacterFileInitializer();
        }
        return uniqueInstance;
    }

    @Override
    public Disk initialize() {
        String filename = "D:\\fileChar.txt";
        Disk disk = CharacterDiskWorker.read(filename);
        return disk;
    }
}
