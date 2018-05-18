/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.container;

import by.bntu.fitr.povt.jit.lab13.model.container.Disk;
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
public class DiskTest {

    public DiskTest() {
    }
/*
    @Test
    public void testCount() throws NotPositiveLenException, MyNullPointerException {
        Disk disk = new Disk();
        assertEquals(disk.count(), 0);
        disk.add(new FolkMusic("Folk1", 50, 10, "Name1"));
        assertEquals(disk.count(), 1);
        disk.add(new FolkMusic("Folk1", 50, 10, "Name1"));
        assertEquals(disk.count(), 2);
    }

    @Test
    public void testIn() throws NotPositiveLenException, MyNullPointerException {
        Disk disk = new Disk();
        Music m = new FolkMusic("Folk1", 50, 10, "Name1");
        disk.add(m);
        assertTrue(disk.in(m));
    }

    @Test
    public void testInFail() throws NotPositiveLenException, MyNullPointerException {
        Disk disk = new Disk();
        Music m = new FolkMusic("Folk1", 50, 10, "Name1");
        //disk.add(m);
        assertFalse(disk.in(m));
    }

    @Test(expected = MyNullPointerException.class)
    public void testInFailEx() throws NotPositiveLenException, MyNullPointerException {
        Disk disk = new Disk();
        disk.in(null);
    }

    @Test
    public void testAdd() throws NotPositiveLenException, MyNullPointerException {
        Disk disk = new Disk();
        Music m = new FolkMusic("Folk1", 50, 10, "Name1");
        disk.add(m);
        assertTrue(disk.in(m));
    }
    
    @Test(expected = MyNullPointerException.class)
    public void testAddFailEx() throws NotPositiveLenException, MyNullPointerException {
        Disk disk = new Disk();
        disk.add(null);
    }
    
    @Test(expected = MyNullPointerException.class)
    public void testDelFailEx() throws NotPositiveLenException, MyNullPointerException, NotThisMusicInDiskException {
        Disk disk = new Disk();
        Music m = new FolkMusic("Folk1", 50, 10, "Name1");
        disk.del(null);
    }
    
    @Test(expected = NotThisMusicInDiskException.class)
    public void testDelFailEx2() throws NotPositiveLenException, MyNullPointerException, NotThisMusicInDiskException {
        Disk disk = new Disk();
        Music m = new FolkMusic("Folk1", 50, 10, "Name1");
        disk.del(m);
    }
    
    @Test
    public void testDel() throws NotPositiveLenException, MyNullPointerException, NotThisMusicInDiskException {
        Disk disk = new Disk();
        Music m = new FolkMusic("Folk1", 50, 10, "Name1");
        disk.add(m);
        assertTrue(disk.in(m));
        disk.del(m);
        assertFalse(disk.in(m));
        assertEquals(disk.count(), 0);
    }
    
    @Test
    public void testSwap() throws NotPositiveLenException, MyNullPointerException, NotThisMusicInDiskException {
        Disk disk = new Disk();
        Music m1 = new FolkMusic("Folk1", 50, 10, "Name1");
        Music m2 = new FolkMusic("Folk1", 50, 10, "Name1");
        disk.add(m1);
        disk.add(m2);
        disk.swap(m1, m2);
        
        Disk disk2 = new Disk();
        disk2.add(m2);
        disk2.add(m1);
        assertTrue(disk.equals(disk2));
        
        //assertTrue(disk.in(m1));
        //assertTrue(disk.in(m2));
        //assertEquals(disk.count(), 2);
    }
    
    @Test
    public void testSwap2() throws NotPositiveLenException, MyNullPointerException, NotThisMusicInDiskException {
        Disk disk = new Disk();
        Music m1 = new FolkMusic("Folk1", 50, 10, "Name1");
        Music m2 = new FolkMusic("Folk1", 50, 10, "Name1");
        disk.add(m1);
        disk.add(m2);
        disk.swap(m1, m2);
        disk.swap(m1, m2);
        
        Disk disk2 = new Disk();
        disk2.add(m1);
        disk2.add(m2);
        assertTrue(disk.equals(disk2));
    }
    
    @Test(expected = MyNullPointerException.class)
    public void testSwapEx1() throws NotPositiveLenException, MyNullPointerException, NotThisMusicInDiskException {
        Disk disk = new Disk();
        disk.swap(null, null);
    }
    
    @Test(expected = NotThisMusicInDiskException.class)
    public void testSwapEx2() throws NotPositiveLenException, MyNullPointerException, NotThisMusicInDiskException {
        Disk disk = new Disk();
        Music m1 = new FolkMusic("Folk1", 50, 10, "Name1");
        Music m2 = new FolkMusic("Folk1", 50, 10, "Name1");
        disk.add(m1);
        disk.swap(m1, m2);
        assertTrue(disk.in(m1));
    }
    */

}
