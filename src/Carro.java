public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private int velocidade;


    public Carro() {
        this.modelo = ""; // Inicializa com string vazia
        this.marca = "";  // Inicializa com string vazia
        this.ano = 0;     // Inicializa com 0
        this.velocidade = 0; // Inicializa com 0
    }


    public Carro(String modelo, String marca, int ano) {
        this();
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.velocidade = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void acelerar() {
        this.velocidade += 10;
    }

    public void frear() {
        this.velocidade = Math.max(0, this.velocidade - 10);
    }

    public int exibirVelocidade() {
        return this.velocidade;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", velocidade=" + velocidade +
                '}';
    }
}