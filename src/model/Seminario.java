package model;

import java.time.LocalDate;

public class Seminario extends Evento {
    private String tema;
    private String nomeAluno;
    private String nomeOrientador;

    public Seminario(String titulo, LocalDate data, int duracaoHoras, double orcamento, Local local,
                     String tema, String nomeAluno, String nomeOrientador) {
        super(titulo, data, duracaoHoras, orcamento, local);
        this.tema = tema;
        this.nomeAluno = nomeAluno;
        this.nomeOrientador = nomeOrientador;
    }
}
