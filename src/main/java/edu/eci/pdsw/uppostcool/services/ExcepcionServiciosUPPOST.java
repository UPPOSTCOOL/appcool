/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.services;

/**
 *
 * @author juan
 */
public class ExcepcionServiciosUPPOST extends Exception {
    
    public ExcepcionServiciosUPPOST() {
    }

    public ExcepcionServiciosUPPOST(String message) {
        super(message);
    }

    public ExcepcionServiciosUPPOST(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcepcionServiciosUPPOST(Throwable cause) {
        super(cause);
    }
}
