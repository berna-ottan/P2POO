package model;

public class Auditorio extends Local {
    private boolean temSom;
    private boolean temTraducao;

    public Auditorio(String nome, int capacidade, String bloco, boolean temSom, boolean temTraducao) {
        super(nome, capacidade, bloco);
        this.temSom = temSom;
        this.temTraducao = temTraducao;
    }
}

