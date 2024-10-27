public class TestaCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.setModelo("Polo");
        carro1.setMarca("Volkswagen");
        carro1.setAno(2010);

        System.out.println(carro1);
        carro1.acelerar();
        System.out.println("Velocidade após acelerar: " + carro1.exibirVelocidade() + " km/h");

        carro1.frear();
        System.out.println("Velocidade após frear: " + carro1.exibirVelocidade() + " km/h");

        System.out.println();


        Carro carro2 = new Carro("500", "Fiat", 2020);
        System.out.println(carro2);
        carro2.acelerar();
        carro2.acelerar();
        System.out.println("Velocidade após acelerar: " + carro2.exibirVelocidade() + " km/h");

        carro2.frear();
        System.out.println("Velocidade após frear: " + carro2.exibirVelocidade() + " km/h");
    }
}
