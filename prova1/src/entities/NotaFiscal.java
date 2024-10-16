package entities;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotaFiscal {

    List<Object> list = new ArrayList<>();
    private static int numNota = 0;
    private Cliente cliente;
    private Date dataNota;
    

    public NotaFiscal(Cliente cliente) {
        numNota++;
        this.cliente = cliente;
        this.dataNota = new Date();

    }

    public Date getDataNota() {
        return dataNota;
    }

    public NotaFiscal() {
    }

    public static int getNumNota() {
        return numNota;
    }

    public void getList(Object obj) {
        list.add(obj);
    }

    public double calcularTotal() {
        double valorTotal = 0;
        for (Object obj : list) {
            if (obj instanceof Automovel) {
                valorTotal += ((Automovel) obj).getPreço();
            }
            if (obj instanceof Peças) {
                valorTotal += ((Peças) obj).getPreço();
            }
            if (obj instanceof ServiçoOficina) {
                valorTotal += ((ServiçoOficina) obj).getPreço();
            }
        }
        return valorTotal;
    }

  public void exibirNota() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
        System.out.println("========================");
        System.out.println("        NOTA FISCAL     ");
        System.out.println("========================");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Número da Nota: " + numNota);
        System.out.println("Data: " + sdf.format(dataNota)); 
        System.out.println("------------------------");
        System.out.println("       ITENS DA NOTA    ");
        System.out.println("------------------------");

        for (Object obj : list) {
            System.out.println(obj);
        }

        System.out.println("------------------------");
        System.out.printf("Valor Total: R$ %.2f%n", calcularTotal());
        System.out.println("========================");
    }

}
