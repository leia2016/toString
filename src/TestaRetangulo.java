public class TestaRetangulo {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(5, 10);


        System.out.println(retangulo);


        retangulo.setLargura(7);
        retangulo.setAltura(14);


        System.out.println("Após modificar:");
        System.out.println(retangulo);
    }
}
