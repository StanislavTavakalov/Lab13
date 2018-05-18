/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.exception;

import by.bntu.fitr.povt.jit.lab13.model.exception.InvalidPercentageValueException;

/**
 *
 * @author Swyatoslaw Yakimovich
 */
public class InvalidCompressionValueException extends InvalidPercentageValueException {

    public InvalidCompressionValueException() {
    }

    public InvalidCompressionValueException(String message) {
        super(message);
    }
    
}
