/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.util;

import by.bntu.fitr.povt.jit.lab13.model.container.Disk;
import by.bntu.fitr.povt.jit.lab13.model.exception.NotPositiveLenException;
import by.bntu.fitr.povt.jit.lab13.model.file.File;
import by.bntu.fitr.povt.jit.lab13.model.file.soundfile.SoundFile;
import by.bntu.fitr.povt.jit.lab13.model.music.Music;

/**
 *
 * @author Святослав
 */
public enum DamageChecker {
    INSTANCE;
    
    public int countDamageFiles(Disk<?> disk) {
        int count = 0;
        for (File file : disk) {
            //file.damage(5);
        }
        return 0;
    }
}

/*
public class DamageChecker {

    /*public static int countLenWintDamage(Disk disk) throws NotPositiveLenException {
        if (disk.count() > 0) {
            int len = 0;
            for (Music music : disk) {
                len += music.getLen() * (100 - music.getDamage()) / 100;
            }
            return len;
        } else {
            throw new NotPositiveLenException();
        }
    }
    
    public static String countLenWintDamageTimeFormat(Disk disk) throws NotPositiveLenException {
        int len = countLenWintDamage(disk);
        int minut = len/60;
        if(minut > 0){
            return minut + ":" + len%60;
        }
        return "0:" + len%60;
    }

//    public static int countLenWintDamage(Disk disk) throws NotPositiveLenException{
//        if(disk.count() > 0){
//           int len = 0;
//        for(int i=0;i<disk.count();i++){
//            Music music = disk.getMusic(i);
//            len += music.getLen() * (100 - music.getDamage()) / 100;
//        }
//        return len; 
//        }
//        else{
//            throw new NotPositiveLenException();
//        }
//    }
     //*
}
*/
