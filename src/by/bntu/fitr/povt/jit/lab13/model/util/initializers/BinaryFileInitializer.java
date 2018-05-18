/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.util.initializers;

import by.bntu.fitr.povt.jit.lab13.filework.BinaryDiskWorker;
import by.bntu.fitr.povt.jit.lab13.model.container.Disk;
import by.bntu.fitr.povt.jit.lab13.model.exception.InvalidPercentageValueException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NegativeFileSizeException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NegativeLengthException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NullPointerStringExceptions;

/**
 *
 * @author Dima_T
 */
public class BinaryFileInitializer implements Initializer {
    private static BinaryFileInitializer uniqueInstance;

    private BinaryFileInitializer() {
    }
    
    public static BinaryFileInitializer getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new BinaryFileInitializer();
        }
        return uniqueInstance;
    }

    @Override
    public Disk initialize() throws NullPointerStringExceptions, NegativeFileSizeException, InvalidPercentageValueException, NegativeLengthException {
        String filename = "D:\\file.bin";
        Disk disk = BinaryDiskWorker.read(filename);
        return disk;
    }
}
