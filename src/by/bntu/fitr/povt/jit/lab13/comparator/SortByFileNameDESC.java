/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.comparator;

import by.bntu.fitr.povt.jit.lab13.model.file.File;
import java.util.Comparator;

/**
 *
 * @author Dima_T
 */
public class SortByFileNameDESC implements Comparator<File>{

    @Override
    public int compare(File o1, File o2) {
       return o2.getFileName().compareTo(o1.getFileName());
    }
    
    
}
