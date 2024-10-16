package Serviço;

import java.time.LocalDate;
import java.time.ZoneId;

import entities.GerenciadorParcelas;
import entities.NotaFiscal;
import entities.Parcela;

public class ContratoOficina {
    Pagamento pagamento;
   

    public ContratoOficina(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void processarContrato(NotaFiscal notaFiscal,GerenciadorParcelas gp, int meses) {

        double valorTotal = notaFiscal.calcularTotal();
      

        LocalDate dataNota = notaFiscal.getDataNota().toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        for (int i = 1; i <= meses; i++) {
            LocalDate dueDate = dataNota.plusMonths(i);
        
            // Cálculo da parcela mensal e taxa
            double parcela = pagamento.parcela(valorTotal, meses); // parcela mensal
            double taxa = pagamento.taxaPagamento(parcela); // taxa da parcela mensal
    
            // Valor total a ser pago na parcela (parcela + taxa)
            double valorComTaxa = parcela + taxa;
    
            // Criar uma nova parcela com o valor total e data de vencimento
            Parcela p = new Parcela(valorComTaxa, dueDate);
            gp.addParcela(p);

        }

    }

}
