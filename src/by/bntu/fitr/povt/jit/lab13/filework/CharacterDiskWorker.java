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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author Dima_T
 */
public class CharacterDiskWorker {

    public static void write(Disk<File> disk, String fileName) {

        try (BufferedWriter stream = new BufferedWriter(new FileWriter(fileName))) {
            for (File file : disk) {
                stream.write(file.getFileName()+"\n");
                stream.write(String.valueOf(file.getDamage()+"\n"));
                stream.write(String.valueOf(file.getSize()+"\n"));
            }

        } catch (IOException ex) {
            View.println("IOException");
        }

    }

    public static Disk read(String fileName) {
        Disk<File> disk = null;

        try (BufferedReader stream = new BufferedReader(new FileReader(fileName))){
           
            disk = new Disk<>();
            String value;
            while ((value = stream.readLine())!= null) {
                UncompressedSoundFile file = new UncompressedSoundFile();
                file.setFileName(value);
                file.setDamage(Integer.parseInt(stream.readLine()));
                file.setSize(Double.parseDouble(stream.readLine()));
                disk.add(file);
            }

            return disk;
        } catch (IOException | NullPointerStringExceptions | InvalidPercentageValueException | NegativeFileSizeException ex) {
            View.println("Exception");
        }
        return disk;
    }

}
