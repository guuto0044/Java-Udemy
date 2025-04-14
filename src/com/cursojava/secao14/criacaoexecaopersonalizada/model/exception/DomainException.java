package com.cursojava.secao14.criacaoexecaopersonalizada.model.exception;

public class DomainException extends RuntimeException{

//    RuntimeException : Tipo de exceção onde o compilador não obriga a ser tratado.
//    Exception: Obriga a tratar a exception.

    public DomainException (String msg){
        super(msg);
    }
}
