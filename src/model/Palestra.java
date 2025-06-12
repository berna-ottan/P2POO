package model;

public class Palestra extends Evento {
    private String nomePalestrante;
    private String emailPalestrante;
    private String instituicao;

    public Palestra(String titulo, java.time.LocalDate data, int duracaoHoras, double orcamento, Local local,
                    String nomePalestrante, String emailPalestrante, String instituicao) {
        super(titulo, data, duracaoHoras, orcamento, local);
        this.nomePalestrante = nomePalestrante;
        this.emailPalestrante = emailPalestrante;
        this.instituicao = instituicao;
    }
}

