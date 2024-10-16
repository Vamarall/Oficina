package entities;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorParcelas {
    private List<Parcela> parcelas = new ArrayList<>();

    public void addParcela(Parcela parcela) {
        parcelas.add(parcela);
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void exibeParcelas() {
        for (Parcela p : parcelas) {
            System.out.println(p);
        }
    }

}
