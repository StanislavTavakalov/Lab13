/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.exception;

/**
 *
 * @author Swyatoslaw Yakimovich
 */
public class ListIsEmptyException extends StorageIsEmptyException {

    public ListIsEmptyException() {
    }

    public ListIsEmptyException(String message) {
        super(message);
    }
    
}
