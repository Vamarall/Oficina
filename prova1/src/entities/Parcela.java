package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Parcela {

   private Double valor;
   private LocalDate data;
   private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

   public Double getValor() {
       return valor;
   }

   public LocalDate getData() {
       return data;
   }

   public Parcela(Double valor, LocalDate data) {
       this.valor = valor;
       this.data = data;
   }

   public String toString() {
       return data.format(fmt) + " - " + String.format("%.2f", valor);
   }
}
