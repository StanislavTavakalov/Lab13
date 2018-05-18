/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.util;

import by.bntu.fitr.povt.jit.lab13.model.util.DamageChecker;
import by.bntu.fitr.povt.jit.lab13.model.container.Disk;
import by.bntu.fitr.povt.jit.lab13.model.exception.MyNullPointerException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NotPositiveLenException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NotThisMusicInDiskException;
import by.bntu.fitr.povt.jit.lab13.model.music.AuthorsMusic;
import by.bntu.fitr.povt.jit.lab13.model.music.Music;
import by.bntu.fitr.povt.jit.lab13.model.music.FolkMusic;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Святослав
 */
public class DamageCheckerTest {
    
    public DamageCheckerTest() {
    }
/*
    @Test(expected = NotPositiveLenException.class)
    public void testCountLenWintDamage()throws NotPositiveLenException{
        Disk disk = new Disk();
        DamageChecker.countLenWintDamage(disk);
    }
    
    @Test
    public void testCountLenWintDamage1() throws NotPositiveLenException, MyNullPointerException {
        Disk disk = new Disk();
        disk.add(new FolkMusic("Folk1", 50, 10, "Name1"));
        disk.add(new FolkMusic("Folk1", 50, 10, "Name1"));
        disk.add(new FolkMusic("Folk1", 50, 10, "Name1"));
        disk.add(new FolkMusic("Folk1", 50, 10, "Name1"));
        
        assertEquals(DamageChecker.countLenWintDamage(disk), 180);
    }
    
    @Test
    public void testCountLenWintDamage2() throws NotPositiveLenException, MyNullPointerException {
        Disk disk = new Disk();
        disk.add(new AuthorsMusic("Autor1", 50, 10, "Name1"));
        disk.add(new AuthorsMusic("Autor1", 50, 100, "Name1"));
        disk.add(new FolkMusic("Folk1", 50, 50, "Name1"));
        disk.add(new FolkMusic("Folk1", 50, 90, "Name1"));
        
        assertEquals(DamageChecker.countLenWintDamage(disk), 75);
    }
    
    @Test
    public void testCountLenWintDamage3() throws NotPositiveLenException, MyNullPointerException {
        Disk disk = new Disk();
        disk.add(new AuthorsMusic("Autor1", 10, 0, "Name1"));
        disk.add(new FolkMusic("Folk1", 10, 0, "Name1"));
        assertEquals(DamageChecker.countLenWintDamage(disk), 20);
    }
    
    @Test
    public void testCountLenWintDamage4() throws NotPositiveLenException, MyNullPointerException {
        Disk disk = new Disk();
        disk.add(new AuthorsMusic("Autor1", 10, 100, "Name1"));
        disk.add(new FolkMusic("Folk1", 10, 100, "Name1"));
        assertEquals(DamageChecker.countLenWintDamage(disk), 0);
    }
    
    @Test
    public void testCountLenWintDamage5() throws NotPositiveLenException, MyNullPointerException {
        Disk disk = new Disk();
        disk.add(new AuthorsMusic("Autor1", 10, 50, "Name1"));
        assertEquals(DamageChecker.countLenWintDamage(disk), 5);
    }
    
    
    @Test(expected = NotPositiveLenException.class)
    public void testCountLenWintDamageFailEx() throws NotPositiveLenException, NotThisMusicInDiskException, MyNullPointerException {
        Disk disk = new Disk();
        DamageChecker.countLenWintDamage(disk);
        //assertEquals(DamageChecker.countLenWintDamage(disk), 180);
    }
  
   */ 
}
