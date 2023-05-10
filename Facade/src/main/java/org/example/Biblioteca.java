package org.example;

public class Biblioteca extends Setor {

    private static Biblioteca biblioteca = new Biblioteca();

    private Biblioteca() {};

    public static Biblioteca getInstancia() {
        return biblioteca;
    }
}
