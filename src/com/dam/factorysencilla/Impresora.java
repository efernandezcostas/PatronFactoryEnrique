package com.dam.factorysencilla;

public class Impresora implements IComun{
    String msg;

    public Impresora(String msg){
        this.msg=msg;
    }

    @Override
    public void visualiza() {
        System.out.println("Sale por la impresora " + msg);
    }
}