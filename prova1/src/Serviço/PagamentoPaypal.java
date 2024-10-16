package Serviço;

public class PagamentoPaypal implements Pagamento{

    public double taxaPagamento(double valor){
        //é cobrada uma taxa de 2% em cima do valor para que o pagamento seja feito(Padrao Empresa Paypal), por isso deve se usar a interface.
        return valor * 0.02;
    }

    public double parcela(double valor, int meses){

        return valor / meses;

    }
    
}
