/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.util;

import by.bntu.fitr.povt.jit.lab13.comparator.FileSortType;
import by.bntu.fitr.povt.jit.lab13.comparator.SortByDamageASC;
import by.bntu.fitr.povt.jit.lab13.comparator.SortByDamageDESC;
import by.bntu.fitr.povt.jit.lab13.comparator.SortByFileNameDESC;
import by.bntu.fitr.povt.jit.lab13.comparator.SortBySizeASC;
import by.bntu.fitr.povt.jit.lab13.comparator.SortBySizeDESC;
import by.bntu.fitr.povt.jit.lab13.model.container.Disk;
import by.bntu.fitr.povt.jit.lab13.model.file.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileSorter {

    private static Map<FileSortType, Comparator<File>> map;

    static {
        map = new HashMap<>();
        map.put(FileSortType.FILENAME_ASC, null);
        map.put(FileSortType.FILENAME_DESC, new SortByFileNameDESC());
        map.put(FileSortType.SIZE_ASC, new SortBySizeASC());
        map.put(FileSortType.SIZE_DESC, new SortBySizeDESC());
        map.put(FileSortType.DAMAGE_ASC, new SortByDamageASC());
        map.put(FileSortType.DAMAGE_DESC, new SortByDamageDESC());
        
    }

    public static void sort(Disk<File> disk, FileSortType type) {

        Collections.sort(disk.getStorage(), map.get(type));
        //Collections.sort(new ArrayList(), map.get(type));

    }

    public static void addFileComparator(FileSortType type, Comparator<File> comparator) {
        map.put(type, comparator);
    }

}
