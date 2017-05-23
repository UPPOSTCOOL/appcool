/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.services.impl;

import java.util.List;
import javax.persistence.Tuple;
import javax.persistence.TupleElement;

/**
 *
 * @author UPPOST
 */
public class TupleImp implements Tuple {

    private Object o;
    private Object o2;
    public TupleImp(Object o, Object o2) {
        this.o=o;
        this.o2=o2;
    }

    @Override
    public <X> X get(TupleElement<X> tupleElement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <X> X get(String alias, Class<X> type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(String alias) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <X> X get(int i, Class<X> type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(int i) {
        if(i==0)return o;
        else return o2;
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TupleElement<?>> getElements() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
