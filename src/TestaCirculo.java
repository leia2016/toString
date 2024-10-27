public class TestaCirculo {
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(5);
        System.out.println(circulo1);


        circulo1.setRaio(10);
        System.out.println("Após mudar o raio para 10:");
        System.out.println(circulo1);


        Circulo circulo2 = new Circulo();
        circulo2.setRaio(7);
        System.out.println("Círculo com raio 7:");
        System.out.println(circulo2);
    }
}
