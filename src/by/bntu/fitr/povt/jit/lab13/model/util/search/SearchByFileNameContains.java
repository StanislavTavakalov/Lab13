/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.util.search;

import by.bntu.fitr.povt.jit.lab13.model.file.File;
import java.util.function.Predicate;

/**
 *
 * @author Swyatoslaw
 */
public class SearchByFileNameContains implements Predicate<File>{
    private String substring = "";

    public SearchByFileNameContains() {
    }

    public SearchByFileNameContains(String substring) {
        this.substring = substring;
    }
    
    @Override
    public boolean test(File t) {
        return t.getFileName().contains(substring);
    }

    public String getSubstring() {
        return substring;
    }

    public void setSubstring(String substring) {
        this.substring = substring;
    }
    
}
