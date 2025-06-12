package model;

public class Laboratorio extends Local {
    private int numComputadores;
    private String tipo; // "Informática" ou "Química"

    public Laboratorio(String nome, int capacidade, String bloco, int numComputadores, String tipo) {
        super(nome, capacidade, bloco);
        this.numComputadores = numComputadores;
        this.tipo = tipo;
    }
}

