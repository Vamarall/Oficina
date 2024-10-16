package entities;

import exception.DomainException;

public class Automovel {

    private String modelo;
    private Cor cor;
    private int ano;
    private double preço;

    public Automovel(String modelo, Cor cor, int ano, double preço) {
        this.modelo = modelo;
        this.cor = cor;
        if (ano < 1886) {
            throw new DomainException("O ano do automovel é invalido");
        }
        this.ano = ano;
        this.preço = preço;

    }

    public Automovel() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public String toString() {
        return getModelo();
    }

}