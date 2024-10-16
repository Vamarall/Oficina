package entities;



public class Peças {

    private Marca marca;
    private String descricao;
    private double preço;

    public Peças(Marca marca, String descricao, double preço) {
        this.marca = marca;
        this.descricao = descricao;
        this.preço = preço;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public String toString(){
        return getDescricao();
    }

}
