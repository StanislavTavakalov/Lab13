/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.util;

import by.bntu.fitr.povt.jit.lab13.model.container.Disk;
import by.bntu.fitr.povt.jit.lab13.model.container.RAID1;
import by.bntu.fitr.povt.jit.lab13.model.container.storage.List;
import by.bntu.fitr.povt.jit.lab13.model.file.File;
import by.bntu.fitr.povt.jit.lab13.model.exception.InvalidValueException;
import java.util.Random;
import by.bntu.fitr.povt.jit.lab13.model.container.storage.Storage;

/**
 *
 * @author Swyatoslaw Yakimovich
 */
public class Damager {

    private static Damager uniqueInstance;

    private Damager() {
    }

    public static Damager getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Damager();
        }
        return uniqueInstance;
    }

    public void damageDisk(Disk<? extends File> disk) throws InvalidValueException {
        Random random = new Random();
        for (File file : disk) {
            if (random.nextBoolean()) {
                file.damage(random.nextInt(101));
            }
        }
    }
    
    public void damageRAID1(RAID1<? extends File> raid1) throws InvalidValueException {
        Random random = new Random();
        for (File file : raid1) {
            if (random.nextBoolean()) {
                file.damage(random.nextInt(101));
            }
        }
    }

}
