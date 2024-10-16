package program;

import entities.Cor;
import entities.GerenciadorParcelas;
import entities.Marca;
import entities.NotaFiscal;
import entities.Peças;
import entities.ServiçoOficina;
import exception.DomainException;
import Serviço.ContratoOficina;
import Serviço.PagamentoPaypal;
import entities.Automovel;
import entities.Cliente;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            // Criando o cliente VICTOR e os serviços que ele deseja realizar
            Cliente c1 = new Cliente("Victor", 1, "amaralvitor580@gmail.com", LocalDate.of(2005, 9, 29));
            Automovel automovel1 = new Automovel("Jetta GLI", Cor.PRETO, 2023, 230000.00);
            Peças peças = new Peças(Marca.VW, "Retrovisor Jetta GLI 23/23", 3500.00);
            ServiçoOficina serviçoOficina = new ServiçoOficina("Instalação retrovisor Jetta GLI", 1, 120);

            // Instanciando a nota fiscal
            NotaFiscal notaFiscal = new NotaFiscal(c1);
            notaFiscal.getList(automovel1);
            notaFiscal.getList(peças);
            notaFiscal.getList(serviçoOficina);

            // Criando o cliente ANTONIO e os serviços que ele deseja realizar
            Cliente c2 = new Cliente("Antonio", 2, "victorsouza45@hotmail.com", LocalDate.of(1963, 5, 8));
            Automovel automovel2 = new Automovel("Fastback abarth", Cor.BRANCO, 2024, 160000.00);
            ServiçoOficina serviçoOficina2 = new ServiçoOficina("Polimento", 2, 60);

            // Instanciando a nota fiscal
            NotaFiscal notaFiscal2 = new NotaFiscal(c2);
            notaFiscal2.getList(automovel2);
            notaFiscal2.getList(serviçoOficina2);

            // Adicionando nota do cliente c2
            c2.getNotas(notaFiscal2);
            c2.exibirNotas();

            // Supondo que o cliente Antonio deseje parcelar em 3 vezes
            ContratoOficina contratoOficina = new ContratoOficina(new PagamentoPaypal());
            GerenciadorParcelas gerenciadorParcelas = new GerenciadorParcelas();

            // Processando o contrato e adicionando as parcelas ao gerenciador
            contratoOficina.processarContrato(notaFiscal2, gerenciadorParcelas, 3);

            // Exibindo as parcelas
            System.out.println("Parcelas: ");
            gerenciadorParcelas.exibeParcelas();

        } catch (DomainException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
