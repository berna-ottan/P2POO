package model;

import java.time.LocalDate;
import java.util.List;

public class Minicurso extends Evento {
    private List<Instrutor> instrutores;
    private int cargaHoraria;
    private List<String> materiais;

    public Minicurso(String titulo, LocalDate data, int duracaoHoras, double orcamento, Local local,
                     List<Instrutor> instrutores, int cargaHoraria, List<String> materiais) {
        super(titulo, data, duracaoHoras, orcamento, local);
        this.instrutores = instrutores;
        this.cargaHoraria = cargaHoraria;
        this.materiais = materiais;
    }
}

