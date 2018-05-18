/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.filework;

import by.bntu.fitr.povt.jit.lab13.model.container.Disk;
import by.bntu.fitr.povt.jit.lab13.model.exception.InvalidPercentageValueException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NegativeFileSizeException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NullPointerStringExceptions;
import by.bntu.fitr.povt.jit.lab13.model.file.File;
import by.bntu.fitr.povt.jit.lab13.model.file.soundfile.UncompressedSoundFile;
import by.bntu.fitr.povt.jit.lab13.view.View;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Dima_T
 */
public class BinaryDiskWorker {

    public static void write(Disk<File> disk, String fileName) {

        try (DataOutputStream stream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
            for (File file : disk) {
                stream.writeUTF(file.getFileName());
                stream.writeInt(file.getDamage());
                stream.writeDouble(file.getSize());
            }

        } catch (IOException ex) {
            View.println("IOException");
        }

    }

    public static Disk read(String fileName) {
        Disk<File> disk = null;

        try (DataInputStream stream = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {

            disk = new Disk<>();
            while (stream.available() != 0) {
                UncompressedSoundFile file = new UncompressedSoundFile();
                file.setFileName(stream.readUTF());
                file.setDamage(stream.readInt());
                file.setSize(stream.readDouble());
                disk.add(file);
            }

            return disk;
        } catch (IOException | NullPointerStringExceptions | InvalidPercentageValueException | NegativeFileSizeException ex) {
            View.println("Exception");
        }
        return disk;
    }
}
