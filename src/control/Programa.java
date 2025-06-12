package control;

import model.*;

import java.time.LocalDate;
import java.util.Arrays;

public class Programa {
    public static void main(String[] args) {
        //Criando locais
        Sala sala = new Sala("Sala 301", 40, "Bloco C", 301, true);
        Auditorio auditorio = new Auditorio("Sala IBM", 300, "Bloco A", true, true);
        Laboratorio laboratorio = new Laboratorio("Lab de Arquitetura", 50, "Bloco B", 10, "Informática");

        //Criando responsáveis
        Instrutor instrutor1 = new Instrutor("Clayton", "clayton@ibm.com", "Mestre", "Arquitetura de computadores");
        Instrutor instrutor2 = new Instrutor("Thiago", "thiago@ibm.com", "Mestre", "POO");

        Organizador organizador = new Organizador("Bernardo", "bernardo.oprocopio@gmail.com", "Responsável por inscrições");

        // Criando participantes
        Participante p1 = new Participante("Viktor", "12345678900", "viktor@gmail.com", "CDIA");
        Participante p2 = new Participante("Tiago", "98765432100", "tiago@gmail.com", "Computação");

        // Criando eventos
        Palestra palestra = new Palestra(
                "Revolução Tecnológica",
                LocalDate.of(2025, 6, 20),
                4,
                1000.0,
                auditorio,
                "Dr. Gabriel Couto",
                "gabriel@gmail.com",
                "IBMEC"
        );

        Minicurso minicurso = new Minicurso(
                "Introdução ao Java",
                LocalDate.of(2025, 6, 22),
                4,
                1500.0,
                sala,
                Arrays.asList(instrutor1, instrutor2),
                4,
                Arrays.asList("Notebook", "Material Didático", "Projetor")
        );

        Seminario seminario = new Seminario(
                "Aplicações de IA na Medicina",
                LocalDate.of(2025, 6, 25),
                3,
                500.0,
                laboratorio,
                "IA Médica",
                "Enzo",
                "Prof. Lucas"
        );

        // Saída para o console
        System.out.println("Eventos Acadêmicos Criados com Sucesso:");
        System.out.println("- " + palestra.getClass().getSimpleName() + ": " + palestra);
        System.out.println("- " + minicurso.getClass().getSimpleName() + ": " + minicurso);
        System.out.println("- " + seminario.getClass().getSimpleName() + ": " + seminario);
    }
}

