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
public class SearchByFileNameStartWith implements Predicate<File>{
    private String prefix = "";

    public SearchByFileNameStartWith() {
    }

    public SearchByFileNameStartWith(String prefix) {
        this.prefix = prefix;
    }
    
    @Override
    public boolean test(File t) {
        return t.getFileName().startsWith(prefix);
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    
}
