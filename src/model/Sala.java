package model;

public class Sala extends Local {
    private int numeroSala;
    private boolean temMultimidia;

    public Sala(String nome, int capacidade, String bloco, int numeroSala, boolean temMultimidia) {
        super(nome, capacidade, bloco);
        this.numeroSala = numeroSala;
        this.temMultimidia = temMultimidia;
    }
}

