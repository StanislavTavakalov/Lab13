/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.util;

//import by.bntu.fitr.povt.jit.lab10.model.util.Sorter;
import by.bntu.fitr.povt.jit.lab13.model.container.Disk;
import by.bntu.fitr.povt.jit.lab13.model.exception.DiskIsEmptyException;
import by.bntu.fitr.povt.jit.lab13.model.exception.MyNullPointerException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NotPositiveLenException;
import by.bntu.fitr.povt.jit.lab13.model.exception.NotThisMusicInDiskException;
import by.bntu.fitr.povt.jit.lab13.model.music.FolkMusic;
import by.bntu.fitr.povt.jit.lab13.model.music.Music;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Святослав
 */
public class SorterTest {
    
    public SorterTest() {
    }
/*
    @Test(expected = NotPositiveLenException.class)
    public void selectionSortLenEx2() throws NotPositiveLenException, MyNullPointerException, NotThisMusicInDiskException, DiskIsEmptyException {
        Disk disk = new Disk();
        Sorter.selectionSortLen(disk);
    }
    
    @Test
    public void selectionSortLen1() throws NotPositiveLenException, MyNullPointerException, NotThisMusicInDiskException, DiskIsEmptyException {
        Disk disk = new Disk();
        Music m1 = new FolkMusic("Folk1", 100, 10, "Name1");
        disk.add(m1);
        Sorter.selectionSortLen(disk);
        
        Disk disk2 = new Disk();
        disk2.add(m1);
        
        assertTrue(disk.equals(disk2));
    }
    
    @Test
    public void selectionSortLen2() throws NotPositiveLenException, MyNullPointerException, NotThisMusicInDiskException, DiskIsEmptyException {
        Disk disk = new Disk();
        Music m1 = new FolkMusic("Folk1", 100, 10, "Name1");
        Music m2 = new FolkMusic("Folk2", 150, 10, "Name1");
        Music m3 = new FolkMusic("Folk3", 90, 10, "Name1");
        Music m4 = new FolkMusic("Folk4", 110, 10, "Name1");
        disk.add(m1);
        disk.add(m2);
        disk.add(m3);
        disk.add(m4);
        Sorter.selectionSortLen(disk);
        
        Disk disk2 = new Disk();
        disk2.add(m3);
        disk2.add(m1);
        disk2.add(m4);
        disk2.add(m2);
        
        assertTrue(disk.equals(disk2));
    }
    
    @Test
    public void selectionSortDamage2() throws NotPositiveLenException, MyNullPointerException, NotThisMusicInDiskException, DiskIsEmptyException {
        Disk disk = new Disk();
        Music m1 = new FolkMusic("Folk1", 100, 100, "Name1");
        Music m2 = new FolkMusic("Folk2", 150, 30, "Name1");
        Music m3 = new FolkMusic("Folk3", 90, 60, "Name1");
        Music m4 = new FolkMusic("Folk4", 110, 10, "Name1");
        disk.add(m1);
        disk.add(m2);
        disk.add(m3);
        disk.add(m4);
        Sorter.selectionSortDamage(disk);
        
        Disk disk2 = new Disk();
        disk2.add(m4);
        disk2.add(m2);
        disk2.add(m3);
        disk2.add(m1);
        
        assertTrue(disk.equals(disk2));
    }
    */
}
