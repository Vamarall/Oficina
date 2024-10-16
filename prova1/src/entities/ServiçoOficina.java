package entities;

public class ServiçoOficina {

    private String descricao;
    private int horasTrabalhadas;
    private double valorHora;

    public ServiçoOficina(String descricao, int horasTrabalhadas, double valorHora) {
        this.descricao = descricao;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public ServiçoOficina() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getPreço(){
        return getValorHora() * getHorasTrabalhadas();
    }

    public String toString(){
        return getDescricao();
    }
}
