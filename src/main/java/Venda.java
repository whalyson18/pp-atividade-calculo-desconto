import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.function.Function;

public class Venda {
    @Getter @Setter private long id;
    @Getter @Setter private LocalDate data;
    @Getter @Setter private double valorTotal;

    @Setter private Function<Venda, Double> processarDesconto = venda -> 0.0;

    @Getter @Setter private Cliente cliente;

    public Venda() {/**/}

    public Venda(Function<Venda, Double> processarDesconto) {
        this.processarDesconto = processarDesconto;
    }

    public Venda(long id, LocalDate data, double valorTotal, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
    }

    public double valorComDesconto(){
        return this.processarDesconto.apply(this);
    }

    @Override
    public String toString() {
        return "Venda{" +
                "data=" + data +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
