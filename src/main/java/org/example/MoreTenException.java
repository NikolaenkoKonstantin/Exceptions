package org.example;

public class MoreTenException extends Exception{
    MoreTenException(int n){
        super("Exception: More than 10 letters entered. " + n + " > 10");
    }
}
