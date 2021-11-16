package Atividade02;

public class CarroCorrida {

    private int numeroCarro;
    private String piloto, equipe;
    private float velocidadeMaxima, velocidadeAtual;
    private boolean ligado;

    public CarroCorrida(int numeroCarro, String piloto, String equipe, float velocidadeMaxima, float getVelocidadeAtual, boolean ligado) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.equipe = equipe;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = getVelocidadeAtual;
        this.ligado = ligado;
    }

    public int getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(int numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float getVelocidadeAtual) {
        this.velocidadeAtual = getVelocidadeAtual;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void acelerar(float velocidade){
        if (this.ligado == true) {
            setVelocidadeAtual(getVelocidadeAtual() + velocidade);
            if(getVelocidadeAtual() > this.velocidadeMaxima){
                System.out.println("Não pode acelerar além do limite");
            }else{
                System.out.println("O carro acelerou " + velocidade + " km/h");
                System.out.println("A velocidade atual é de " + getVelocidadeAtual() + " km/h");
            }
        }else{
            System.out.println("Você precisa ligar o carro!");
        }


    }

    public void frear(float frenagem){
        float diminuindo = getVelocidadeAtual() * frenagem;
        setVelocidadeAtual(getVelocidadeAtual() - diminuindo);
        float porcentagem = frenagem*100;
        System.out.println("O carro freou " + (int)  porcentagem  + "% da sua velocidade");
        System.out.println("A velocidade atual é de " + getVelocidadeAtual() + " km/h");
    };

    public  void parar(){
        setVelocidadeAtual(0);
    }

    public void ligar(){
        setLigado(true);
    }

    public void desligar(){
        if (getVelocidadeAtual() == 0){
            setLigado(false);
            System.out.println("Carro desligado");
        }else {
            System.out.println("Pare o carro para desligar!");
        }
    }
}
