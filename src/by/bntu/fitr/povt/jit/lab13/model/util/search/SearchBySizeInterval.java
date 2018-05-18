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
public class SearchBySizeInterval implements Predicate<File>{
    private double lowerBound;
    private double upperBound;

    public SearchBySizeInterval() {
    }

    public SearchBySizeInterval(double lowerBound, double upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }
    
    @Override
    public boolean test(File t) {
        return t.getSize()>=lowerBound && t.getSize() <= upperBound;
    }

    public double getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(double lowerBound) {
        this.lowerBound = lowerBound;
    }

    public double getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(double upperBound) {
        this.upperBound = upperBound;
    }
    
}
