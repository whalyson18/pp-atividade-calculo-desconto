import java.util.Random;

public class CalcularDesconto {
    public static double descontoDefinido(Venda venda){
        double descontoDefinidoDB = 10;

        double desconto = descontoDefinidoDB / 100;

        double valorDescontar = venda.getValorTotal() * desconto;

        double valorComDesconto = venda.getValorTotal() - valorDescontar;

        return valorComDesconto;
    }

    public static double descontoProgessivo(Venda venda){
        double prograssao = venda.getValorTotal() / 25;

        double descontoProgressivo = prograssao > 20 ? 20 : prograssao;

        double desconto = descontoProgressivo / 100;

        double valorDescontar = venda.getValorTotal() * desconto;

        double valorComDesconto = venda.getValorTotal() - valorDescontar;

        return valorComDesconto;
    }

    public static double descontoAniversário(Venda venda){
        return venda.getCliente().getDataNascimento() == venda.getData()
                ? (venda.getValorTotal() * 0.15) - venda.getValorTotal()
                : venda.getValorTotal();
    }
}
