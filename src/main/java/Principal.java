import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Whalyson Ramos", LocalDate.parse("18/05/1990", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        Venda venda = new Venda(1, LocalDate.now(), 100, cliente);

        venda.setProcessarDesconto(CalcularDesconto::descontoProgessivo);
        System.out.println(venda.valorComDesconto());
    }
}
