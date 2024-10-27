public class Retangulo {
    private double largura;
    private double altura;


    public Retangulo() {
        this.largura = 0;
        this.altura = 0;
    }


    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return this.largura * this.altura;
    }

    public double calcularPerimetro() {
        return 2 * (this.largura + this.altura);
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "largura=" + largura +
                ", altura=" + altura +
                ", area=" + calcularArea() +
                ", perimetro=" + calcularPerimetro() +
                '}';
    }
}
