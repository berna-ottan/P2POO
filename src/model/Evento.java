package model;

import java.time.LocalDate;

public abstract class Evento {
    private String titulo;
    private LocalDate data;
    private int duracaoHoras;
    private double orcamento;
    private Local local;

    public Evento(String titulo, LocalDate data, int duracaoHoras, double orcamento, Local local) {
        this.titulo = titulo;
        this.data = data;
        this.duracaoHoras = duracaoHoras;
        this.orcamento = orcamento;
        this.local = local;
    }
}

