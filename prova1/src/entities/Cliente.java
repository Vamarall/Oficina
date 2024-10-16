package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import exception.DomainException;

public class Cliente {

    private String nome;
    private int cpf;
    private String email;
    private LocalDate dataNascimento;
    List<NotaFiscal> notas = new ArrayList<>();

    public Cliente(String nome, int cpf, String email, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        if (dataNascimento.isAfter(LocalDate.now())) {
            throw new DomainException("Data nascimento invalida");
        }
        this.dataNascimento = dataNascimento;
    }

    public Cliente() {
    }

    public void getNotas(NotaFiscal notaFiscal) {
        notas.add(notaFiscal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void exibirNotas(){
        for(NotaFiscal nota: notas){
            nota.exibirNota();
        }
    }

}
