package Atividade03;

public class CamaroteSuperior extends Vip{

    private double valorExtra;

    public CamaroteSuperior(double valor, double valorAdicional, double valorExtra) {
        super(valor, valorAdicional);
        this.valorExtra = valorExtra;
    }

    @Override
    public double imprimeValor() {
        return super.imprimeValor() + this.valorExtra;
    }
}
