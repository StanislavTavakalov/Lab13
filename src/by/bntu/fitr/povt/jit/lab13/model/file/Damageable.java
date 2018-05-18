/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.file;

import by.bntu.fitr.povt.jit.lab13.model.exception.InvalidValueException;

/**
 *
 * @author Swyatoslaw Yakimovich
 */
public interface Damageable {

    public void damage(int percentage) throws InvalidValueException;
}
