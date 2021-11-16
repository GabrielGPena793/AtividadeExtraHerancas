package Atividade03;

public class Vip extends Ingresso{

    private double valorAdicional;

    public Vip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }


    @Override
    public double imprimeValor() {
        return super.imprimeValor() + this.valorAdicional;
    }
}
