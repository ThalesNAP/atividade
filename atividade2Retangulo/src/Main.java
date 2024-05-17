public class Main {
    public static void main(String[] args) {
        RetanguloDecorator bordasArredondadas = new RetanguloBordasArredondadas("Olá, mundo!");
        RetanguloDecorator linhasDuplas = new RetanguloLinhasDuplas("Olá, mundo!");
        RetanguloDecorator asciiArt = new RetanguloAsciiArt("Olá, mundo!");
        RetanguloDecorator colorido = new RetanguloColorido("Olá, mundo!");

        bordasArredondadas.desenhar();
        System.out.println();
        linhasDuplas.desenhar();
        System.out.println();
        asciiArt.desenhar();
        System.out.println();
        colorido.desenhar();
    }
}
