/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.util.search;

import by.bntu.fitr.povt.jit.lab13.model.container.Disk;
import by.bntu.fitr.povt.jit.lab13.model.file.File;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author Swyatoslaw
 */
public class FileSearcher {

    private static Map<FileSearchFilter, Predicate<File>> filters;

    static {
        filters = new HashMap<>();
        filters.put(FileSearchFilter.DAMAGE_INTERVAL, new SearchByDamageInterval());
        filters.put(FileSearchFilter.SIZE_INTERVAL, new SearchBySizeInterval());
        filters.put(FileSearchFilter.FILE_NAME_START_WITH, new SearchByFileNameStartWith());
        filters.put(FileSearchFilter.FILE_NAME_CONTAINS, new SearchByFileNameContains());
    }

    public static void putSearchFilter(FileSearchFilter key, Predicate<File> value) {
        filters.put(key, value);
    }

    public static void replaceSearchFilter(FileSearchFilter key, Predicate<File> value) {
        filters.replace(key, value);
    }

//    List
    public static List<File> search(Disk<File> disk, FileSearchFilter filter) {
        return disk.getStorage().stream().filter(filters.get(filter)).collect(Collectors.toList());
    }
    
    public static List<File> searchByFilter(Disk<File> disk, Predicate<File> filter) {
        return disk.getStorage().stream().filter(filter).collect(Collectors.toList());
    }

    public static List<File> searchByDamageInterval(Disk<File> disk, int lowerBound, int upperBound) {
        return disk.getStorage().stream().filter(
                new SearchByDamageInterval(lowerBound, upperBound)
                    ).collect(Collectors.toList());
    }
    
    public static List<File> searchBySizeInterval(Disk<File> disk, double lowerBound, double upperBound) {
        return disk.getStorage().stream().filter(
                new SearchBySizeInterval(lowerBound, upperBound)
                    ).collect(Collectors.toList());
    }
    
        public static List<File> searchByNameStartWith(Disk<File> disk, String prefix) {
        return disk.getStorage().stream().filter(
                new SearchByFileNameStartWith(prefix)
                    ).collect(Collectors.toList());
    }
        public static List<File> searchByNameContains(Disk<File> disk, String substring) {
        return disk.getStorage().stream().filter(
                new SearchByFileNameContains(substring)
                    ).collect(Collectors.toList());
    }

}
