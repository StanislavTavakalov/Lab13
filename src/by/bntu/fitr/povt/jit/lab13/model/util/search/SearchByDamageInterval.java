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
public class SearchByDamageInterval implements Predicate<File>{
    private int lowerBound;
    private int upperBound;

    
    public SearchByDamageInterval() {
    }

    public SearchByDamageInterval(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }
    
    
    
    @Override
    public boolean test(File t) {
        return t.getDamage()>=lowerBound && t.getDamage() <= upperBound;
    }
    
}
