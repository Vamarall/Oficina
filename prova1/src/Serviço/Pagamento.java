package Serviço;

public interface Pagamento {

    public double taxaPagamento(double valor);
    public double parcela(double valor, int meses);

    
}
